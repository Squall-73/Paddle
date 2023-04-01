package com.example.paddle.helper;

import com.example.paddle.entities.Equipo;

public class EquipoHelper {

	public static Equipo genEquipoDoble(){

		Equipo e = new Equipo();
		e.setJugadorA(JugadorHelper.genJugador());
		e.setJugadorB(JugadorHelper.genJugador());

		return e;

	}

	public static Equipo genEquipoSingle(){

		Equipo e = new Equipo();
		e.setJugadorA(JugadorHelper.genJugador());

		return e;

	}
}
