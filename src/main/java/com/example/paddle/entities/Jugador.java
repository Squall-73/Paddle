package com.example.paddle.entities;
import jakarta.persistence.*;

@Entity

@Table(name="jugador")
public class Jugador {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nombre;
    String pais;
    String tipo_juego;
    int edad;
    int puesto_ranking;
    int puntaje_ranking;

    public Jugador(){}

    public Jugador(String nombre, String pais, String tipo_juego, int edad, int puesto_ranking, int puntaje_ranking) {
        this.nombre = nombre;
        this.pais = pais;
        this.tipo_juego = tipo_juego;
        this.edad = edad;
        this.puesto_ranking = puesto_ranking;
        this.puntaje_ranking = puntaje_ranking;
    }
}
