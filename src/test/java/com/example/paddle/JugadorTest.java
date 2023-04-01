package com.example.paddle;

import com.example.paddle.entities.Jugador;
import com.example.paddle.helper.JugadorHelper;
import com.example.paddle.repository.JugadorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.Assert.*;


@SpringBootTest
public class JugadorTest {

    @Autowired
    JugadorRepository jugadorRepository;
    Jugador j = JugadorHelper.genJugador();


		@Test
		public void saveTest() {

				jugadorRepository.save(j);
				long id = j.getId();
				Jugador jugadorOp = this.jugadorRepository.findById(id);
				assertEquals(jugadorOp.getId(), j.getId());
  		}

	@Test
		public void notNullTest() {
			jugadorRepository.save(j);
			Jugador jugadorOp = this.jugadorRepository.findById(j.getId());
			String nombre = jugadorOp.getNombre();
			String pais = jugadorOp.getPais();
			String tipoJuego=jugadorOp.getTipoJuego();
			assertNotNull(nombre);
			assertNotNull(pais);
			assertNotNull(tipoJuego);
	}
	@Test
	public void minTest() {
		jugadorRepository.save(j);
		Jugador jugadorOp = this.jugadorRepository.findById(j.getId());
		int edad = jugadorOp.getEdad();
		int puestoRanking= jugadorOp.getPuestoRanking();
		int puntajeRanking=jugadorOp.getPuntajeRanking();
		assertTrue(edad>=1);
		assertTrue(puestoRanking>=1);
		assertTrue(puntajeRanking>=0);
	}
}
