package wai.testspringrestrespositories.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wai.testspringrestrespositories.domain.Car;

//@RepositoryRestResource Not necessary if you don't need any config, automatic by Spring Rest Repositories
@RepositoryRestResource(collectionResourceRel = "carList", path = "cars")
public interface CarRepository extends JpaRepository<Car, Long> {
}
