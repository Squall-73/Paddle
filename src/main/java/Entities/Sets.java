package Entities;

public class Sets {

    int id;
    int orden;
    int games;
    boolean win;
    int id_partido;
    int id_equipo;

    public Sets(){};
    public Sets(int id, int orden, int games, boolean win, int id_partido, int id_equipo) {
        this.id = id;
        this.orden = orden;
        this.games = games;
        this.win = win;
        this.id_partido = id_partido;
        this.id_equipo = id_equipo;
    }
}
