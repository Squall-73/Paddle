package com.example.paddle.entities;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Data
@Table(name="torneo")
public class Torneo {


    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@NotNull
	@Valid
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "idTipo")
    private TipoTorneo tipoTorneo;
	@NotNull
	@Min(1)
    private long idCampeon;
	@NotNull
    private String fechaInicio;
	@NotNull
    private String fechaFin;
	@NotNull
    private String nombre;

 }
