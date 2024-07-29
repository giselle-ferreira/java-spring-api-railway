package giselletech.dio_java_spring_railway.service;

import giselletech.dio_java_spring_railway.model.Link;

import java.util.Optional;

public interface LinkService {

    Optional<Link> findById(Long id);
    Link create(Link link);
    Link update(Long id, Link link);
    void delete(Long id);

}
