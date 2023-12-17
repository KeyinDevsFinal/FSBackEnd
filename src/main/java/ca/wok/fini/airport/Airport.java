package ca.wok.fini.airport;

import jakarta.persistence.*;
import org.springframework.security.access.prepost.PostAuthorize;

@Entity
public class Airport {
    @Id
    @SequenceGenerator(name = "airport_sequence", sequenceName = "airport_sequence",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "airport_sequence")
    private Long id;

    private String name;

    private String code;

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
}
