package com.example.paddle.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="sets")
public class Sets {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int orden;
    private int games;
    private boolean win;

    @ManyToOne
    @JoinColumn(name = "idPartido")
    private Partidos partido;

    @ManyToOne
    @JoinColumn(name = "idEquipo")
    private Equipo equipo;
}
