package com.example.paddle.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Random;

@Entity
@Data
@Table(name="jugador")
public class Jugador {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@NotNull
    private String nombre;
	@NotNull
    private String pais;
	@NotNull
    private String tipoJuego;
	@Min(0)
    private int edad;
	@Min(1)
    private int puestoRanking;
	@Min(0)
    private int puntajeRanking;


}
