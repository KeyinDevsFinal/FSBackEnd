package ca.wok.fini.aircraft;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(path = "aircraft", collectionResourceRel = "aircraft")
public interface AircraftAPI extends JpaRepository<Aircraft, Long> {
    public List<Aircraft> findByTailnumber(@RequestParam String tailNumber);
}