package ca.wok.fini.city;

import ca.wok.fini.airport.Airport;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(path = "city", collectionResourceRel = "city")
public interface CityAPI extends JpaRepository<City, Long> {
}