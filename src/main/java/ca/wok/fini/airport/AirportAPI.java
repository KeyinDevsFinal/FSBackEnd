package ca.wok.fini.airport;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(path = "airport", collectionResourceRel = "airport")
public interface AirportAPI extends JpaRepository<Airport, Long> {
    public List<Airport> searchByCode(@RequestParam String code);
}
