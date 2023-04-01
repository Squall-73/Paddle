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
public class EquipoTest {

	@Autowired
	EquipoRepository equipoRepository;
	Equipo equipoSingle= EquipoHelper.genEquipoSingle();
	Equipo equipoDoble= EquipoHelper.genEquipoDoble();


	@Test
	public void saveTest() {

		equipoRepository.save(equipoDoble);
		long id = equipoDoble.getId();
		Equipo equipoOp = this.equipoRepository.findById(id);
		assertEquals(equipoOp.getId(), equipoDoble.getId());


	}

	@Test
	public void notNullTest() {
		equipoRepository.save(equipoSingle);
		Equipo equipoOp = this.equipoRepository.findById(equipoSingle.getId());
		Jugador j =equipoOp.getJugadorA();
		assertNotNull(j);



	}

}
