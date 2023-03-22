package com.example.paddle.helper;
import com.example.paddle.entities.Jugador;

import java.nio.charset.Charset;
import java.util.Random;


public class JugadorHelper extends Jugador{

	public Jugador genJugador() {

		byte[] array = new byte[7]; // length is bounded by 7
		new Random().nextBytes(array);
		String nombre = new String(array, Charset.forName("UTF-8"));
		new Random().nextBytes(array);
		String pais = new String(array, Charset.forName("UTF-8"));
		new Random().nextBytes(array);
		String tipoJuego = new String(array, Charset.forName("UTF-8"));
		int edad = new Random().nextInt(100);
		int puestoRanking = new Random().nextInt(100);
		int puntajeRanking = new Random().nextInt(100);

		Jugador j = new Jugador(nombre, pais, tipoJuego, edad, puestoRanking, puntajeRanking);

		return j;



	}

}
