package ca.wok.fini.airlinetest;

import ca.wok.fini.airline.Airline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineTest {

    private Airline airline;

    @BeforeEach
    public void setUp() {
        airline = new Airline();
    }

    @Test
    public void testSetAndGetId() {
        Long id = 1L;
        airline.setId(id);
        assertEquals(id, airline.getId());
    }

    @Test
    public void testSetAndGetAirlineCode() {
        String airlineCode = "XYZ";
        airline.setAirlineCode(airlineCode);
        assertEquals(airlineCode, airline.getAirlineCode());
    }

    @Test
    public void testSetAndGetName() {
        String name = "AirlineName";
        airline.setName(name);
        assertEquals(name, airline.getName());
    }

    @Test
    public void testSetAndGetCountry() {
        String country = "CountryName";
        airline.setCountry(country);
        assertEquals(country, airline.getCountry());
    }
}
