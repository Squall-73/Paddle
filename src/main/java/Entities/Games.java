package Entities;
import jakarta.persistence.*;


@Entity

@Table(name="games")
public class Games {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int orden;
    int puntos;
    boolean win;
    int id_set;

    public Games(){}

    public Games(int orden, int puntos, boolean win, int id_set) {
        this.orden = orden;
        this.puntos = puntos;
        this.win = win;
        this.id_set = id_set;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public int getId_set() {
        return id_set;
    }

    public void setId_set(int id_set) {
        this.id_set = id_set;
    }
}
