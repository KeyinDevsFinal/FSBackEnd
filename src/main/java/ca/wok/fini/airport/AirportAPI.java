package ca.wok.fini.airport;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(path = "airport", collectionResourceRel = "airport")
public interface AirportAPI extends JpaRepository<Airport, Long> {
}
