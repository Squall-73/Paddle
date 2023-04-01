package com.example.paddle.entities;

import jakarta.persistence.*;
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
    @OneToOne
    @JoinColumn(name = "idTipo")
    private TipoTorneo tipoTorneo;
    private long idCampeon;
    private String fechaInicio;
    private String fechaFin;
    private String nombre;

 }
