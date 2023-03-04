package com.example.paddle.entities;

import jakarta.persistence.*;

@Entity

@Table(name="tipo_torneo")
public class TipoTorneo {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String tipo;
    int puntaje;


    public TipoTorneo(String tipo, int puntaje) {
        this.tipo = tipo;
        this.puntaje = puntaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
