package com.example.paddle.entities;
import jakarta.persistence.*;
import com.example.paddle.entities.Jugador;

import java.util.List;
import java.util.Objects;


@Entity

@Table(name="equipo")
public class Equipo {

    //Primary key
    @Id
    //campo ID autonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "idJugadorA")
    private Jugador jugadorA;

    @ManyToOne
    @JoinColumn(name = "idJugadorB")
    private Jugador jugadorB;

    public Equipo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Jugador getJugadorA() {
        return jugadorA;
    }

    public void setJugadorA(Jugador jugadorA) {
        this.jugadorA = jugadorA;
    }

    public Jugador getJugadorB() {
        return jugadorB;
    }

    public void setJugadorB(Jugador jugadorB) {
        this.jugadorB = jugadorB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return id == equipo.id && Objects.equals(jugadorA, equipo.jugadorA) && Objects.equals(jugadorB, equipo.jugadorB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jugadorA, jugadorB);
    }
}
