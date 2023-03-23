package com.example.paddle.entities;
import jakarta.persistence.*;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Random;

@Entity

@Table(name="jugador")
public class Jugador {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String pais;
    private String tipoJuego;
    private int edad;
    private int puestoRanking;
    private int puntajeRanking;

    public Jugador() {
    }

    public Jugador genJugador(Jugador j) {

        Random random= new Random();
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String nombre = new String(array, Charset.forName("UTF-8"));
        new Random().nextBytes(array);
        String pais = new String(array, Charset.forName("UTF-8"));
        new Random().nextBytes(array);
        String tipoJuego = new String(array, Charset.forName("UTF-8"));
        int edad = random.nextInt(100);
        int puestoRanking = random.nextInt(100);
        int puntajeRanking = random.nextInt(100);

        j.setNombre(nombre);
        j.setPais(pais);
        j.setTipoJuego(tipoJuego);
        j.setEdad(edad);
        j.setPuestoRanking(puestoRanking);
        j.setPuestoRanking(puntajeRanking);
        return j;

    }
	public Jugador(String nombre, String pais, String tipoJuego, int edad, int puestoRanking, int puntajeRanking) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.tipoJuego = tipoJuego;
		this.edad = edad;
		this.puestoRanking = puestoRanking;
		this.puntajeRanking = puntajeRanking;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id && edad == jugador.edad && puestoRanking == jugador.puestoRanking && puntajeRanking == jugador.puntajeRanking && Objects.equals(nombre, jugador.nombre) && Objects.equals(pais, jugador.pais) && Objects.equals(tipoJuego, jugador.tipoJuego);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, pais, tipoJuego, edad, puestoRanking, puntajeRanking);
    }
}
