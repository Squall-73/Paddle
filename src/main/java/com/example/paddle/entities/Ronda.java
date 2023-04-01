package com.example.paddle.entities;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
	@NotNull
	@Min(1)
    private long idSiguiente;
	@NotNull
	@Min(1)
    private int cantidadPartidos;
	@NotNull
	@Valid
    @ManyToOne
    @JoinColumn(name="idTorneo")
    private Torneo Torneo;
	@NotNull
	@Valid
    @ManyToOne
    @JoinColumn(name="idSiguiente", insertable=false, updatable=false)
    private Ronda rondaSiguiente;
}
