package giselletech.dio_java_spring_railway.repository;

import giselletech.dio_java_spring_railway.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {

}
