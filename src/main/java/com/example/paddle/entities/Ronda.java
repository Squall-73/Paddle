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
    int id_siguiente;
    int cantidad_partidos;
    int id_torneo;

    public Ronda(){}
    public Ronda(int id_siguiente, int cantidad_partidos, int id_torneo) {
        this.id_siguiente = id_siguiente;
        this.cantidad_partidos = cantidad_partidos;
        this.id_torneo = id_torneo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_siguiente() {
        return id_siguiente;
    }

    public void setId_siguiente(int id_siguiente) {
        this.id_siguiente = id_siguiente;
    }

    public int getCantidad_partidos() {
        return cantidad_partidos;
    }

    public void setCantidad_partidos(int cantidad_partidos) {
        this.cantidad_partidos = cantidad_partidos;
    }

    public int getId_torneo() {
        return id_torneo;
    }

    public void setId_torneo(int id_torneo) {
        this.id_torneo = id_torneo;
    }
}
