package com.example.paddle.helper;

import com.example.paddle.entities.Jugador;
import java.nio.charset.Charset;
import java.util.Random;

public class JugadorHelper {
	public static Jugador genJugador() {

		Jugador j = new Jugador();
		Random random= new Random();
		byte[] array = new byte[7]; // length is bounded by 7
		new Random().nextBytes(array);
		String nombre = new String(array, Charset.forName("UTF-8"));
		new Random().nextBytes(array);
		String pais = new String(array, Charset.forName("UTF-8"));
		new Random().nextBytes(array);
		String tipoJuego = new String(array, Charset.forName("UTF-8"));
		int edad = random.nextInt(100);
		int puestoRanking = random.nextInt(100);
		int puntajeRanking = random.nextInt(100);

		j.setNombre(nombre);
		j.setPais(pais);
		j.setTipoJuego(tipoJuego);
		j.setEdad(edad);
		j.setPuestoRanking(puestoRanking);
		j.setPuestoRanking(puntajeRanking);

		return j;

	}
}
