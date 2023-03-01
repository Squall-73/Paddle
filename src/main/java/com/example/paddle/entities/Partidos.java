package com.example.paddle.entities;

import jakarta.persistence.*;

@Entity

@Table(name="partidos")
public class Partidos {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int id_equipo_A;
    int id_equipo_B;
    int puntaje_A;
    int puntaje_B;
    boolean resultado;
    int id_ganador;
    int id_ronda;

    public Partidos(){}

    public Partidos(int id_equipo_A, int id_equipo_B, int puntaje_A, int puntaje_B, boolean resultado, int id_ganador, int id_ronda) {
        this.id_equipo_A = id_equipo_A;
        this.id_equipo_B = id_equipo_B;
        this.puntaje_A = puntaje_A;
        this.puntaje_B = puntaje_B;
        this.resultado = resultado;
        this.id_ganador = id_ganador;
        this.id_ronda = id_ronda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_equipo_A() {
        return id_equipo_A;
    }

    public void setId_equipo_A(int id_equipo_A) {
        this.id_equipo_A = id_equipo_A;
    }

    public int getId_equipo_B() {
        return id_equipo_B;
    }

    public void setId_equipo_B(int id_equipo_B) {
        this.id_equipo_B = id_equipo_B;
    }

    public int getPuntaje_A() {
        return puntaje_A;
    }

    public void setPuntaje_A(int puntaje_A) {
        this.puntaje_A = puntaje_A;
    }

    public int getPuntaje_B() {
        return puntaje_B;
    }

    public void setPuntaje_B(int puntaje_B) {
        this.puntaje_B = puntaje_B;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public int getId_ganador() {
        return id_ganador;
    }

    public void setId_ganador(int id_ganador) {
        this.id_ganador = id_ganador;
    }

    public int getId_ronda() {
        return id_ronda;
    }

    public void setId_ronda(int id_ronda) {
        this.id_ronda = id_ronda;
    }
}
