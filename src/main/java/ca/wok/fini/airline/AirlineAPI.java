package ca.wok.fini.airline;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(path = "airline", collectionResourceRel = "airline")
public interface AirlineAPI extends JpaRepository<Airline, Long> {}
