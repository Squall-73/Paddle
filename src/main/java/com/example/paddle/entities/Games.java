package com.example.paddle.entities;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Data
@Table(name="games")
public class Games {

    //Primary key
    @Id
    //campo ID autonumérico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@NotNull
	@Min(1)
    private int orden;
	@NotNull
	private String puntos;
	@NotNull
    private boolean win;
	@NotNull
	@Valid
    @ManyToOne
    @JoinColumn(name = "idSet")
    private Sets set;

}
