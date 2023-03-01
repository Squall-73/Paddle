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

    public Games(int id, int orden, int puntos, boolean win, int id_set) {
        this.id = id;
        this.orden = orden;
        this.puntos = puntos;
        this.win = win;
        this.id_set = id_set;
    }
}
