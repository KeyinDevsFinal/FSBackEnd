package ca.wok.fini.flight;

import ca.wok.fini.airport.Airport;
import jakarta.persistence.*;

@Entity
public class Flight {

    @Id
    @SequenceGenerator(name = "flight_sequence", sequenceName = "flight_sequence",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "flight_sequence")
    private long id;

    @OneToOne
    private Airport origin;

    @OneToOne
    private Airport destination;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Airport getOrigin() {
        return origin;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }
}
