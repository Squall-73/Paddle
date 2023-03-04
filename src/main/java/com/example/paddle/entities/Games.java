package com.example.paddle.entities;
import jakarta.persistence.*;


@Entity

@Table(name="games")
public class Games {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int orden;
    int puntos;
    boolean win;
    int idSet;



    public Games(int orden, int puntos, boolean win, int idSet) {
        this.orden = orden;
        this.puntos = puntos;
        this.win = win;
        this.idSet = idSet;
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

    public int getIdSet() {
        return idSet;
    }

    public void setIdSet(int idSet) {
        this.idSet = idSet;
    }
}
