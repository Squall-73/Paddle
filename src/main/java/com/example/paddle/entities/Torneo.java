package com.example.paddle.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity

@Table(name="torneo")
public class Torneo {


    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "idTipo")
    private TipoTorneo tipoTorneo;
    private long idCampeon;
    private String fechaInicio;
    private String fechaFin;
    private String nombre;

    public Torneo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoTorneo getTipoTorneo() {
        return tipoTorneo;
    }

    public void setTipoTorneo(TipoTorneo tipoTorneo) {
        this.tipoTorneo = tipoTorneo;
    }

    public long getIdCampeon() {
        return idCampeon;
    }

    public void setIdCampeon(long idCampeon) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Torneo torneo = (Torneo) o;
        return id == torneo.id && idCampeon == torneo.idCampeon && Objects.equals(tipoTorneo, torneo.tipoTorneo) && Objects.equals(fechaInicio, torneo.fechaInicio) && Objects.equals(fechaFin, torneo.fechaFin) && Objects.equals(nombre, torneo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoTorneo, idCampeon, fechaInicio, fechaFin, nombre);
    }
}
