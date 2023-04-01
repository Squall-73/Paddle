package com.example.paddle.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
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

}
