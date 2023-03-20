package com.example.paddle.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="partidos")
public class Partidos {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id", cascade = CascadeType.ALL)
    private List<Equipo> Equipo;

    //Un partido tiene varios sets de donde saca el puntaje
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id", cascade = CascadeType.ALL)
    private List<Sets> Set;
    private boolean resultado;
    private int idGanador;

    @ManyToOne
    @JoinColumn(name = "id_ronda")
    private Ronda ronda;

    public Partidos() {
    }

    public Partidos(int id, List<com.example.paddle.entities.Equipo> equipo, List<Sets> set, boolean resultado, int idGanador, Ronda ronda) {
        this.id = id;
        Equipo = equipo;
        Set = set;
        this.resultado = resultado;
        this.idGanador = idGanador;
        this.ronda = ronda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<com.example.paddle.entities.Equipo> getEquipo() {
        return Equipo;
    }

    public void setEquipo(List<com.example.paddle.entities.Equipo> equipo) {
        Equipo = equipo;
    }

    public List<Sets> getSet() {
        return Set;
    }

    public void setSet(List<Sets> set) {
        Set = set;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public int getIdGanador() {
        return idGanador;
    }

    public void setIdGanador(int idGanador) {
        this.idGanador = idGanador;
    }

    public Ronda getRonda() {
        return ronda;
    }

    public void setRonda(Ronda ronda) {
        this.ronda = ronda;
    }
}
