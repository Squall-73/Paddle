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
    int idEquipoA;
    int idEquipoB;
    int puntajeA;
    int puntajeB;
    boolean resultado;
    int idGanador;
    int idRonda;



    public Partidos(int idEquipoA, int idEquipoB, int puntajeA, int puntajeB, boolean resultado, int idGanador, int idRonda) {
        this.idEquipoA = idEquipoA;
        this.idEquipoB = idEquipoB;
        this.puntajeA = puntajeA;
        this.puntajeB = puntajeB;
        this.resultado = resultado;
        this.idGanador = idGanador;
        this.idRonda = idRonda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEquipoA() {
        return idEquipoA;
    }

    public void setIdEquipoA(int idEquipoA) {
        this.idEquipoA = idEquipoA;
    }

    public int getIdEquipoB() {
        return idEquipoB;
    }

    public void setIdEquipoB(int idEquipoB) {
        this.idEquipoB = idEquipoB;
    }

    public int getPuntajeA() {
        return puntajeA;
    }

    public void setPuntajeA(int puntajeA) {
        this.puntajeA = puntajeA;
    }

    public int getPuntajeB() {
        return puntajeB;
    }

    public void setPuntajeB(int puntajeB) {
        this.puntajeB = puntajeB;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public int getIdGanador() {
        return idGanador;
    }

    public void setIdGanador(int idGanador) {
        this.idGanador = idGanador;
    }

    public int getIdRonda() {
        return idRonda;
    }

    public void setIdRonda(int idRonda) {
        this.idRonda = idRonda;
    }
}
