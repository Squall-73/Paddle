package com.example.paddle.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity

@Table(name="sets")
public class Sets {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int orden;
    private int games;
    private boolean win;

    @ManyToOne
    @JoinColumn(name = "idPartido")
    private Partidos partido;

    @ManyToOne
    @JoinColumn(name = "idEquipo")
    private Equipo equipo;


    public Sets() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public Partidos getPartido() {
        return partido;
    }

    public void setPartido(Partidos partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sets sets = (Sets) o;
        return id == sets.id && orden == sets.orden && games == sets.games && win == sets.win && Objects.equals(partido, sets.partido) && Objects.equals(equipo, sets.equipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orden, games, win, partido, equipo);
    }
}
