package com.example.paddle.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Data
@Table(name="tipoTorneo")
public class TipoTorneo {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@NotNull
    private String tipo;
	@NotNull
	@Min(0)
    private int puntaje;
}
