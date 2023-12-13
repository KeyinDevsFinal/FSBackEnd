package ca.wok.fini.passenger;

import jakarta.persistence.*;
public class Passenger {
    @Id
    @SequenceGenerator(name = "passenger_sequence", sequenceName = "passenger_sequence",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "passenger_sequence")
    private Long id;

    private String firstname;

    private String lastname;

    private String phone;

    private String hometown;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
