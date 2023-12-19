package ca.wok.fini.flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(path = "flights", collectionResourceRel = "flights")
public interface FlightAPI extends JpaRepository<Flight, Long> {
    public List<Flight> findByFlightNumber(@RequestParam String flightNumber);
}
