package ca.wok.fini.citytest;

import ca.wok.fini.city.City;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityTest {

    @Test
    public void testCityId() {
        City city = new City();
        city.setId(1L);

        assertEquals(1L, city.getId());
    }

    @Test
    public void testCityName() {
        City city = new City();
        city.setCityname("Toronto");

        assertEquals("Toronto", city.getCityname());
    }

    @Test
    public void testCityProvince() {
        City city = new City();
        city.setProvince("Ontario");

        assertEquals("Ontario", city.getProvince());
    }

    @Test
    public void testCityConstruction() {
        City city = new City();
        city.setId(1L);
        city.setCityname("Vancouver");
        city.setProvince("British Columbia");

        assertEquals(1L, city.getId());
        assertEquals("Vancouver", city.getCityname());
        assertEquals("British Columbia", city.getProvince());
    }
}
