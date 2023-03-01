package Entities;

public class Partidos {

    int id;
    int id_equipo_A;
    int id_equipo_B;
    int puntaje_A;
    int puntaje_B;
    boolean resultado;
    int id_ganador;
    int id_ronda;

    public Partidos(){}

    public Partidos(int id, int id_equipo_A, int id_equipo_B, int puntaje_A, int puntaje_B, boolean resultado, int id_ganador, int id_ronda) {
        this.id = id;
        this.id_equipo_A = id_equipo_A;
        this.id_equipo_B = id_equipo_B;
        this.puntaje_A = puntaje_A;
        this.puntaje_B = puntaje_B;
        this.resultado = resultado;
        this.id_ganador = id_ganador;
        this.id_ronda = id_ronda;
    }
}
