package com.example.paddle.entities;

import jakarta.persistence.*;

@Entity

@Table(name="torneo")
public class Torneo {


    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "id_tipo")
    private TipoTorneo tipoTorneo;
    private int idCampeon;
    private String fechaInicio;
    private String fechaFin;
    private String nombre;

    public Torneo() {
    }

    public Torneo(int id, TipoTorneo tipoTorneo, int idCampeon, String fechaInicio, String fechaFin, String nombre) {
        this.id = id;
        this.tipoTorneo = tipoTorneo;
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

    public TipoTorneo getTipoTorneo() {
        return tipoTorneo;
    }

    public void setTipoTorneo(TipoTorneo tipoTorneo) {
        this.tipoTorneo = tipoTorneo;
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
