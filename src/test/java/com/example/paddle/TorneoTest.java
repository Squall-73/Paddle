package com.example.paddle;

import com.example.paddle.entities.TipoTorneo;
import com.example.paddle.entities.Torneo;
import com.example.paddle.helper.TorneoHelper;
import com.example.paddle.repository.TorneoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class TorneoTest {

	@Autowired
	TorneoRepository torneoRepository;

	Torneo t= TorneoHelper.genTorneo();

	@Test
	public void saveTest() {

		torneoRepository.save(t);
		long id = t.getId();
		Torneo torneoOp = this.torneoRepository.findById(id);
		assertEquals(torneoOp.getId(), t.getId());
	}

	@Test
	public void notNullTest() {
		torneoRepository.save(t);
		long id = t.getId();
		Torneo torneoOp = this.torneoRepository.findById(id);
		String nombre = torneoOp.getNombre();
		TipoTorneo tipoTorneo=torneoOp.getTipoTorneo();
		long idCampeon=torneoOp.getIdCampeon();
		String fechaInicio= torneoOp.getFechaInicio();
		String fechaFin= torneoOp.getFechaFin();
		assertNotNull(nombre);
		assertNotNull(tipoTorneo);
		assertNotNull(idCampeon);
		assertNotNull(fechaInicio);
		assertNotNull(fechaFin);


	}

	@Test
	public void minTest() {
		torneoRepository.save(t);
		Torneo torneoOp = this.torneoRepository.findById(t.getId());
		long idCampeon=torneoOp.getIdCampeon();
		assertTrue(idCampeon>=1);

	}
}
