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
    int idTipo;
    int idCampeon;
    String fechaInicio;
    String fechaFin;
    String nombre;


    public Torneo(int idTipo, int idCampeon, String fechaInicio, String fechaFin, String nombre) {
        this.idTipo = idTipo;
        this.idCampeon = idCampeon;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdCampeon() {
        return idCampeon;
    }

    public void setIdCampeon(int idCampeon) {
        this.idCampeon = idCampeon;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
