package com.example.paddle.entities;
import jakarta.persistence.*;

import java.util.Objects;


@Entity

@Table(name="games")
public class Games {

    //Primary key
    @Id
    //campo ID autonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int orden;
    private int puntos;
    private boolean win;
    @ManyToOne
    @JoinColumn(name = "idSet")
    private Sets set;
    public Games() {
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public Sets getSet() {
        return set;
    }

    public void setSet(Sets set) {
        this.set = set;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return id == games.id && orden == games.orden && puntos == games.puntos && win == games.win && Objects.equals(set, games.set);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orden, puntos, win, set);
    }
}
