package com.example.paddle.entities;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="games")
public class Games {

    //Primary key
    @Id
    //campo ID autonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int orden;
    private int puntos;
    private boolean win;
    @ManyToOne
    @JoinColumn(name = "idSet")
    private Sets set;

}
