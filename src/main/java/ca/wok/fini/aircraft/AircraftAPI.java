package ca.wok.fini.aircraft;
import ca.wok.fini.airport.Airport;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(path = "aircraft", collectionResourceRel = "aircraft")
public interface AircraftAPI extends JpaRepository<Aircraft, Long> {
}