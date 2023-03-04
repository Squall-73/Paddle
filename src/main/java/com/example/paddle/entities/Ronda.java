package com.example.paddle.entities;
import jakarta.persistence.*;


@Entity

@Table(name="ronda")
public class Ronda {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int idSiguiente;
    int cantidadPartidos;
    int idTorneo;


    public Ronda(int idSiguiente, int cantidadPartidos, int idTorneo) {
        this.idSiguiente = idSiguiente;
        this.cantidadPartidos = cantidadPartidos;
        this.idTorneo = idTorneo;
    }

    public int getId() { return id;}

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

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }
}
