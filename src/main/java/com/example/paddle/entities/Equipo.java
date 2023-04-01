package com.example.paddle.entities;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;



@Entity
@Data
@Table(name="equipo")
public class Equipo {

    //Primary key
    @Id
    //campo ID autonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

	@Valid
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "idJugadorA")
	@NotNull
    private Jugador jugadorA;

	@Valid
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "idJugadorB")
    private Jugador jugadorB;

}
