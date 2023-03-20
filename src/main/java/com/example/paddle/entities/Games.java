package com.example.paddle.entities;
import jakarta.persistence.*;




@Entity

@Table(name="games")
public class Games {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int orden;
    private int puntos;
    private boolean win;
    @ManyToOne
    @JoinColumn(name = "id_set")
    private Sets set;
    public Games() {
    }

    public Games(int orden, int puntos, boolean win, Sets set) {
        this.orden = orden;
        this.puntos = puntos;
        this.win = win;
        this.set = set;
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

    public Sets getSet() {
        return set;
    }

    public void setSet(Sets set) {
        this.set = set;
    }
}
