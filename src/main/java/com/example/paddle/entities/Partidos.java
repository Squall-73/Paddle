package com.example.paddle.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name="partidos")
public class Partidos {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "idEquipoA")
    private Equipo equipoA;
    @ManyToOne
    @JoinColumn(name = "idEquipoB")
    private Equipo equipoB;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id", cascade = CascadeType.ALL)
    private List<Sets> Set;
    private boolean resultado;
    private long idGanador;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "idEquipo", referencedColumnName = "idEquipoA"),
            @JoinColumn(name = "idPartido", referencedColumnName = "id")
    })
    private List<Sets> puntajeA;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "idEquipo", referencedColumnName = "idEquipoB"),
            @JoinColumn(name = "idPartido", referencedColumnName = "id")
    })
    private List<Sets> puntajeB;
    @ManyToOne
    @JoinColumn(name = "idRonda")
    private Ronda ronda;

    public Partidos() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Equipo getEquipoA() {
        return equipoA;
    }

    public void setEquipoA(Equipo equipoA) {
        this.equipoA = equipoA;
    }

    public Equipo getEquipoB() {
        return equipoB;
    }

    public void setEquipoB(Equipo equipoB) {
        this.equipoB = equipoB;
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

    public long getIdGanador() {
        return idGanador;
    }

    public void setIdGanador(long idGanador) {
        this.idGanador = idGanador;
    }

    public List<Sets> getPuntajeA() {
        return puntajeA;
    }

    public void setPuntajeA(List<Sets> puntajeA) {
        this.puntajeA = puntajeA;
    }

    public List<Sets> getPuntajeB() {
        return puntajeB;
    }

    public void setPuntajeB(List<Sets> puntajeB) {
        this.puntajeB = puntajeB;
    }

    public Ronda getRonda() {
        return ronda;
    }

    public void setRonda(Ronda ronda) {
        this.ronda = ronda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partidos partidos = (Partidos) o;
        return id == partidos.id && resultado == partidos.resultado && idGanador == partidos.idGanador && Objects.equals(equipoA, partidos.equipoA) && Objects.equals(equipoB, partidos.equipoB) && Objects.equals(Set, partidos.Set) && Objects.equals(puntajeA, partidos.puntajeA) && Objects.equals(puntajeB, partidos.puntajeB) && Objects.equals(ronda, partidos.ronda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, equipoA, equipoB, Set, resultado, idGanador, puntajeA, puntajeB, ronda);
    }
}
