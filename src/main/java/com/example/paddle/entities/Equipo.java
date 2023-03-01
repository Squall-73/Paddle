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
    int id_jugador_A;
    int id_jugador_B;

    public Equipo(){}

    // Constructor para equipo de single
    public Equipo( int id_jugador_A) {
        this.id_jugador_A = id_jugador_A;
    }

    // Constructor para equipo de dobles
    public Equipo(int id_jugador_A, int id_jugador_B) {
        this.id_jugador_A = id_jugador_A;
        this.id_jugador_B = id_jugador_B;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_jugador_A() {
        return id_jugador_A;
    }

    public void setId_jugador_A(int id_jugador_A) {
        this.id_jugador_A = id_jugador_A;
    }

    public int getId_jugador_B() {
        return id_jugador_B;
    }

    public void setId_jugador_B(int id_jugador_B) {
        this.id_jugador_B = id_jugador_B;
    }
}
