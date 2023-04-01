package com.example.paddle;

import com.example.paddle.entities.Jugador;
import com.example.paddle.entities.TipoTorneo;
import com.example.paddle.helper.TipoTorneoHelper;
import com.example.paddle.repository.TipoTorneoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class TipoTorneoTest {

	@Autowired
	TipoTorneoRepository tipoTorneoRepository;

	TipoTorneo t= TipoTorneoHelper.genTipoTorneo();

	@Test
	public void saveTest() {

		tipoTorneoRepository.save(t);
		long id = t.getId();
		TipoTorneo tipoTorneoOp = this.tipoTorneoRepository.findById(id);
		assertEquals(tipoTorneoOp.getId(), t.getId());
	}

	@Test
	public void notNullTest() {
		tipoTorneoRepository.save(t);
		TipoTorneo tipoTorneoOp = this.tipoTorneoRepository.findById(t.getId());
		String tipo = tipoTorneoOp.getTipo();
		int puntaje = tipoTorneoOp.getPuntaje();
		assertNotNull(tipo);
		assertNotNull(puntaje);

	}

	@Test
	public void minTest() {
		tipoTorneoRepository.save(t);
		TipoTorneo tipoTorneoOp = this.tipoTorneoRepository.findById(t.getId());
		int puntaje = tipoTorneoOp.getPuntaje();
		assertTrue(puntaje>=0);

	}


}
