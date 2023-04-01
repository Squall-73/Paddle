package com.example.paddle.helper;

import com.example.paddle.entities.TipoTorneo;
import java.nio.charset.Charset;
import java.util.Random;

public class TipoTorneoHelper {

	public static TipoTorneo genTipoTorneo(){

		TipoTorneo t=new TipoTorneo();
		Random random= new Random();
		byte[] array = new byte[7]; // length is bounded by 7
		new Random().nextBytes(array);
		t.setTipo(new String(array, Charset.forName("UTF-8")));
		t.setPuntaje(random.nextInt(1000));

		return t;
	}
}
