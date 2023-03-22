package com.example.paddle.entities;
import jakarta.persistence.*;

import java.util.Objects;


@Entity

@Table(name="ronda")
public class Ronda {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long idSiguiente;
    private int cantidadPartidos;
    @ManyToOne
    @JoinColumn(name="idTorneo")
    private Torneo Torneo;
    @ManyToOne
    @JoinColumn(name="idSiguiente", insertable=false, updatable=false)
    private Ronda rondaSiguiente;
    public Ronda() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdSiguiente() {
        return idSiguiente;
    }

    public void setIdSiguiente(long idSiguiente) {
        this.idSiguiente = idSiguiente;
    }

    public int getCantidadPartidos() {
        return cantidadPartidos;
    }

    public void setCantidadPartidos(int cantidadPartidos) {
        this.cantidadPartidos = cantidadPartidos;
    }

    public com.example.paddle.entities.Torneo getTorneo() {
        return Torneo;
    }

    public void setTorneo(com.example.paddle.entities.Torneo torneo) {
        Torneo = torneo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ronda ronda = (Ronda) o;
        return id == ronda.id && idSiguiente == ronda.idSiguiente && cantidadPartidos == ronda.cantidadPartidos && Objects.equals(Torneo, ronda.Torneo) && Objects.equals(rondaSiguiente, ronda.rondaSiguiente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idSiguiente, cantidadPartidos, Torneo, rondaSiguiente);
    }
}
