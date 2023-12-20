package ca.wok.fini.airporttest;

import ca.wok.fini.airport.Airport;
import ca.wok.fini.city.City;
import ca.wok.fini.flight.Flight;
import ca.wok.fini.gates.Gates;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AirportTest {

    private Airport airport;

    @BeforeEach
    public void setUp() {
        City city = new City();
        city.cityname = "Toronto";

        List<Gates> gates = new ArrayList<>();
        Gates gate = new Gates();
        gates.add(gate);

        List<Flight> flights = new ArrayList<>();
        Flight flight = new Flight();
        flights.add(flight);

        airport = new Airport();
        airport.setCity(city);
        airport.setGates(gates);
        airport.setFlights(flights);
    }

    @Test
    public void testCityName() {
        assertNotNull(airport.getCity());
        assertEquals("Toronto", airport.getCity().cityname);
    }

    @Test
    public void testGates() {
        assertNotNull(airport.getGates());
        assertEquals(1, airport.getGates().size());
    }

    @Test
    public void testFlights() {
        assertNotNull(airport.getFlights());
        assertEquals(1, airport.getFlights().size());
    }

}
