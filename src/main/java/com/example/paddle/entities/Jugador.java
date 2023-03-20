package com.example.paddle.entities;
import jakarta.persistence.*;

@Entity

@Table(name="jugador")
public class Jugador {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String pais;
    private String tipoJuego;
    private int edad;
    private int puestoRanking;
    private int puntajeRanking;

    public Jugador() {
    }

    public Jugador(String nombre, String pais, String tipoJuego, int edad, int puestoRanking, int puntajeRanking) {
        this.nombre = nombre;
        this.pais = pais;
        this.tipoJuego = tipoJuego;
        this.edad = edad;
        this.puestoRanking = puestoRanking;
        this.puntajeRanking = puntajeRanking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuestoRanking() {
        return puestoRanking;
    }

    public void setPuestoRanking(int puestoRanking) {
        this.puestoRanking = puestoRanking;
    }

    public int getPuntajeRanking() {
        return puntajeRanking;
    }

    public void setPuntajeRanking(int puntajeRanking) {
        this.puntajeRanking = puntajeRanking;
    }
}
