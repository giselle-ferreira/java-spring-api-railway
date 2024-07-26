package giselletech.dio_java_spring_railway.repository;

import giselletech.dio_java_spring_railway.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LinkRepository extends JpaRepository<Link, UUID> {
}
