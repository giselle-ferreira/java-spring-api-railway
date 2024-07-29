package giselletech.dio_java_spring_railway.service;

import giselletech.dio_java_spring_railway.model.Link;

import java.util.List;
import java.util.Optional;

public interface LinkService {

    Optional<Link> findById(Long id);
    List<Link> findAllLinks();
    Link create(Link link);
    Link update(Long id, Link link);
    void delete(Long id);

}
