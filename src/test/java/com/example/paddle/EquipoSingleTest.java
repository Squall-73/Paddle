package com.example.paddle;

import com.example.paddle.entities.Equipo;
import com.example.paddle.entities.Jugador;
import com.example.paddle.helper.EquipoHelper;
import com.example.paddle.repository.EquipoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class EquipoSingleTest {

	@Autowired
	EquipoRepository equipoRepository;
	Equipo equipoSingle= EquipoHelper.genEquipoSingle();


	@Test
	public void saveTest() {

		equipoRepository.save(equipoSingle);
		long id = equipoSingle.getId();
		Equipo equipoOp = this.equipoRepository.findById(id);
		assertEquals(equipoOp.getId(), equipoSingle.getId());


	}

	@Test
	public void notNullTest() {
		equipoRepository.save(equipoSingle);
		Equipo equipoOp = this.equipoRepository.findById(equipoSingle.getId());
		Jugador j =equipoOp.getJugadorA();
		assertNotNull(j);



	}

}
