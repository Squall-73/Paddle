package Entities;

public class Ronda {

    int id;
    int id_siguiente;
    int cantidad_partidos;
    int id_torneo;

    public Ronda(){}
    public Ronda(int id, int id_siguiente, int cantidad_partidos, int id_torneo) {
        this.id = id;
        this.id_siguiente = id_siguiente;
        this.cantidad_partidos = cantidad_partidos;
        this.id_torneo = id_torneo;
    }
}
