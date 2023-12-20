package ca.wok.fini.aircrafttest;

import ca.wok.fini.aircraft.Aircraft;
import ca.wok.fini.airline.Airline;
import ca.wok.fini.flight.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AircraftTest {

    private Aircraft aircraft;

    @BeforeEach
    public void setUp() {
        aircraft = new Aircraft();
        aircraft.setTailnumber("XYZ123");
        aircraft.setBrand("Boeing");
        aircraft.setModel("737");

        Airline airline = new Airline();
        airline.setName("Air Canada");
        
        aircraft.airline = airline;

        Flight flight1 = new Flight();
        flight1.setFlightNumber("AC123");
        Flight flight2 = new Flight();
        flight2.setFlightNumber("AC124");

        List<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);

        aircraft.setFlights(flights);
    }

    @Test
    public void testAircraftTailnumber() {
        assertEquals("XYZ123", aircraft.getTailnumber());
    }

    @Test
    public void testAircraftBrand() {
        assertEquals("Boeing", aircraft.getBrand());
    }

    @Test
    public void testAircraftModel() {
        assertEquals("737", aircraft.getModel());
    }

    @Test
    public void testAircraftAirlineName() {
        assertNotNull(aircraft.airline);
        assertEquals("Air Canada", aircraft.airline.getName());
    }

    @Test
    public void testAircraftFlightsSize() {
        assertEquals(2, aircraft.getFlights().size());
    }

}
