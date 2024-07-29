package giselletech.dio_java_spring_railway.service.impl;

import giselletech.dio_java_spring_railway.model.Link;
import giselletech.dio_java_spring_railway.repository.LinkRepository;
import giselletech.dio_java_spring_railway.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkRepository linkRepository;

    @Override
    public Optional<Link> findById(Long id) {
        return Optional.ofNullable(linkRepository.findById(id).orElseThrow(NoSuchElementException::new));
    }

    @Override
    public List<Link> findAllLinks() {
        return linkRepository.findAll();
    }

    @Override
    public Link create(Link link) {
        if(link.getId() != null && linkRepository.existsById(link.getId())){
            throw new IllegalArgumentException("Link ID already exists.");
        } else {
            return linkRepository.save(link);
        }
    }

    @Override
    public Link update(Long id, Link linkToUpdate) {

        Link existingLink = linkRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Link not found with id " + id));

        existingLink.setUrl(linkToUpdate.getUrl());
        existingLink.setDescription(linkToUpdate.getDescription());

        return linkRepository.save(existingLink);

    }

    @Override
    public void delete(Long id) {
        if (!linkRepository.existsById(id)) {
            throw new IllegalArgumentException("Link not found with id " + id);
        }

        linkRepository.deleteById(id);
    }
}
