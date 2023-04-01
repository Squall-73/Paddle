package com.example.paddle.entities;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
	@NotNull
	@Valid
	@ManyToOne
	@JoinColumn(name = "idEquipoA")
    private Equipo equipoA;
	@NotNull
	@Valid
    @ManyToOne
    @JoinColumn(name = "idEquipoB")
    private Equipo equipoB;
	@NotNull
	@Valid
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id", cascade = CascadeType.ALL)
    private List<Sets> Set;
	@NotNull
    private boolean resultado;
	@NotNull
	@Min(1)
    private long idGanador;
	@NotNull
	@Valid
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "idEquipo", referencedColumnName = "idEquipoA"),
            @JoinColumn(name = "idPartido", referencedColumnName = "id")
    })
    private List<Sets> puntajeA;
	@NotNull
	@Valid
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "idEquipo", referencedColumnName = "idEquipoB"),
            @JoinColumn(name = "idPartido", referencedColumnName = "id")
    })
    private List<Sets> puntajeB;
	@NotNull
	@Valid
    @ManyToOne
    @JoinColumn(name = "idRonda")
    private Ronda ronda;

}
