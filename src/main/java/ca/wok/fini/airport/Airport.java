package ca.wok.fini.airport;

import ca.wok.fini.city.City;
import ca.wok.fini.flight.Flight;
import ca.wok.fini.gates.Gates;
import jakarta.persistence.*;
import org.springframework.security.access.prepost.PostAuthorize;

import java.util.List;

@Entity
public class Airport {
    @Id
    @SequenceGenerator(name = "airport_sequence", sequenceName = "airport_sequence",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "airport_sequence")
    private Long id;

    private String name;

    private String code;

    @OneToOne
    private City city;

    @OneToMany
    private List<Gates> gates;

    @OneToMany
    private List<Flight> flights;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode() {
        this.code = code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Gates> getGates() {
        return gates;
    }

    public void setGates(List<Gates> gates) {
        this.gates = gates;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
