package ca.wok.fini.airline;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(path = "airline", collectionResourceRel = "airline")
public interface AirlineAPI extends JpaRepository<Airline, Long> {
    public List<Airline> findByAirlineCode(@RequestParam String airlineCode);
}
