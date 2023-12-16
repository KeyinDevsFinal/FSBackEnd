package ca.wok.fini.gates;

import jakarta.persistence.*;
public class Gates {
    @Id
    @SequenceGenerator(name = "gates_sequence", sequenceName = "gates_sequence",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "gates_sequence")
    private Long id;

    private String gateNumber;
    private String terminal;
    private boolean occupied;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
