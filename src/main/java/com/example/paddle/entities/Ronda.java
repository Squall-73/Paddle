package com.example.paddle.entities;
import jakarta.persistence.*;


@Entity

@Table(name="ronda")
public class Ronda {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idSiguiente;
    private int cantidadPartidos;
    @ManyToOne
    @JoinColumn(name="id_torneo")
    private Torneo Torneo;
    public Ronda() {
    }

    public Ronda(int id, int idSiguiente, int cantidadPartidos, com.example.paddle.entities.Torneo torneo) {
        this.id = id;
        this.idSiguiente = idSiguiente;
        this.cantidadPartidos = cantidadPartidos;
        Torneo = torneo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSiguiente() {
        return idSiguiente;
    }

    public void setIdSiguiente(int idSiguiente) {
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
}
