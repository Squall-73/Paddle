package com.example.paddle.entities;

import jakarta.persistence.*;

@Entity

@Table(name="sets")
public class Sets {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int orden;
    int games;
    boolean win;
    int idPartido;
    int idEquipo;

     public Sets(int orden, int games, boolean win, int idPartido, int idEquipo) {
        this.orden = orden;
        this.games = games;
        this.win = win;
        this.idPartido = idPartido;
        this.idEquipo = idEquipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
}
