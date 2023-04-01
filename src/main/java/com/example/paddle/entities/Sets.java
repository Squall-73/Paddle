package com.example.paddle.entities;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
	@NotNull
	@Min(1)
    private int orden;
	@NotNull
	@Min(0)
    private int games;
    private boolean win;

	@NotNull
	@Valid
    @ManyToOne
    @JoinColumn(name = "idPartido")
    private Partidos partido;

	@NotNull
	@Valid
    @ManyToOne
    @JoinColumn(name = "idEquipo")
    private Equipo equipo;
}
