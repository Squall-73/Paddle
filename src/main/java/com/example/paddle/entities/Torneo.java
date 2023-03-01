package com.example.paddle.entities;

import jakarta.persistence.*;

@Entity

@Table(name="torneo")
public class Torneo {


    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int id_tipo;
    int id_campeon;
    String fecha_inicio;
    String fecha_fin;
    String nombre_torneo;

    public Torneo(){}

    public Torneo(int id_tipo, int id_campeon, String fecha_inicio, String fecha_fin, String nombre_torneo) {
        this.id_tipo = id_tipo;
        this.id_campeon = id_campeon;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.nombre_torneo = nombre_torneo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getId_campeon() {
        return id_campeon;
    }

    public void setId_campeon(int id_campeon) {
        this.id_campeon = id_campeon;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getNombre_torneo() {
        return nombre_torneo;
    }

    public void setNombre_torneo(String nombre_torneo) {
        this.nombre_torneo = nombre_torneo;
    }
}
