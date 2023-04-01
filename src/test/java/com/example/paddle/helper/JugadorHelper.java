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

		j.setNombre(new String(array, Charset.forName("UTF-8")));
		j.setPais(new String(array, Charset.forName("UTF-8")));
		j.setTipoJuego(new String(array, Charset.forName("UTF-8")));
		j.setEdad(random.nextInt(100));
		j.setPuestoRanking(random.nextInt(100));
		j.setPuestoRanking(random.nextInt(100));

		return j;

	}
}
