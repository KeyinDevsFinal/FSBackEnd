package ca.wok.fini.passenger;

import ca.wok.fini.airport.Airport;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(path = "passenger", collectionResourceRel = "passenger")
public interface PassengerAPI extends JpaRepository<Passenger, Long> {
}