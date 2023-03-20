package com.example.paddle.entities;
import jakarta.persistence.*;
import com.example.paddle.entities.Jugador;

import java.util.List;


@Entity

@Table(name="equipo")
public class Equipo {

    //Primary key
    @Id
    //campo ID autonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id", cascade = CascadeType.ALL)
    private List<Jugador> Jugadores;


    public Equipo() {
    }


    public Equipo(List<Jugador> jugadores) {
        Jugadores = jugadores;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        Jugadores = jugadores;
    }
}
