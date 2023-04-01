package com.example.paddle.helper;

import com.example.paddle.entities.Torneo;

import java.nio.charset.Charset;
import java.util.Random;

public class TorneoHelper {

	public static Torneo genTorneo(){

		Torneo t=new Torneo();
		Random random= new Random();
		byte[] array = new byte[7]; // length is bounded by 7
		new Random().nextBytes(array);

		t.setTipoTorneo(TipoTorneoHelper.genTipoTorneo());
		t.setNombre(new String(array, Charset.forName("UTF-8")));
		t.setFechaInicio(new String(array, Charset.forName("UTF-8")));
		t.setFechaFin(new String(array, Charset.forName("UTF-8")));
		t.setIdCampeon(random.nextInt(100)+1);

		return t;
	}




}
