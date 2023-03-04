package com.example.paddle.entities;
import jakarta.persistence.*;


@Entity

@Table(name="equipo")
public class Equipo {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int idJugadorA;
    int idJugadorB;


    // Constructor para equipo de single
    public Equipo( int idJugadorA) {
        this.idJugadorA = idJugadorA;
    }

    // Constructor para equipo de dobles
    public Equipo(int idJugadorA, int idJugadorB) {
        this.idJugadorA = idJugadorA;
        this.idJugadorB = idJugadorB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJugadorA() {
        return idJugadorA;
    }

    public void setIdJugadorA(int idJugadorA) {
        this.idJugadorA = idJugadorA;
    }

    public int getIdJugadorB() {
        return idJugadorB;
    }

    public void setIdJugadorB(int idJugadorB) {
        this.idJugadorB = idJugadorB;
    }
}
