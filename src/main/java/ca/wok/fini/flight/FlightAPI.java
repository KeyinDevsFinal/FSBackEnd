package ca.wok.fini.flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "flights", collectionResourceRel = "flights")
public interface FlightAPI extends JpaRepository<Flight, Long> {
}
