package com.example.paddle.entities;

import jakarta.persistence.*;
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
    private String tipo;
    private int puntaje;
}
