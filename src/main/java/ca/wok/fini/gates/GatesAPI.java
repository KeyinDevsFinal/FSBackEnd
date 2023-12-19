package ca.wok.fini.gates;
import ca.wok.fini.airport.Airport;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(path = "gates", collectionResourceRel = "gates")
    public interface GatesAPI extends JpaRepository<Gates, Long> {
        public List<Gates> findByAirport(@RequestParam Airport airportCode);
    }

