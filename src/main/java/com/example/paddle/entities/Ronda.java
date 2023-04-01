package com.example.paddle.entities;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="ronda")
public class Ronda {

    //Primary key
    @Id
    //campo ID auonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long idSiguiente;
    private int cantidadPartidos;
    @ManyToOne
    @JoinColumn(name="idTorneo")
    private Torneo Torneo;
    @ManyToOne
    @JoinColumn(name="idSiguiente", insertable=false, updatable=false)
    private Ronda rondaSiguiente;
}
