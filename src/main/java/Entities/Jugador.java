package Entities;

public class Jugador {

    int id;
    String nombre;
    String pais;
    String tipo_juego;
    int edad;
    int puesto_ranking;
    int puntaje_ranking;

    public Jugador(){}

    public Jugador(int id, String nombre, String pais, String tipo_juego, int edad, int puesto_ranking, int puntaje_ranking) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.tipo_juego = tipo_juego;
        this.edad = edad;
        this.puesto_ranking = puesto_ranking;
        this.puntaje_ranking = puntaje_ranking;
    }
}
