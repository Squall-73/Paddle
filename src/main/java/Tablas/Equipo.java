package Tablas;

public class Equipo {

    int id;
    int id_jugador_A;
    int id_jugador_B;

    public Equipo(){}

    // Constructor para equipo de single
    public Equipo(int id, int id_jugador_A) {
        this.id = id;
        this.id_jugador_A = id_jugador_A;
    }

    // Constructor para equipo de dobles
    public Equipo(int id, int id_jugador_A, int id_jugador_B) {
        this.id = id;
        this.id_jugador_A = id_jugador_A;
        this.id_jugador_B = id_jugador_B;
    }

}
