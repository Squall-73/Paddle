package Entities;

import jakarta.persistence.*;

@Entity

@Table(name="sets")
public class Sets {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int orden;
    int games;
    boolean win;
    int id_partido;
    int id_equipo;

    public Sets(){};
    public Sets(int orden, int games, boolean win, int id_partido, int id_equipo) {
        this.orden = orden;
        this.games = games;
        this.win = win;
        this.id_partido = id_partido;
        this.id_equipo = id_equipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }
}
