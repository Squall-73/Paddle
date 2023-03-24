package com.example.paddle;

import com.example.paddle.entities.Jugador;
import com.example.paddle.exceptions.NotNullException;
import com.example.paddle.helper.JugadorHelper;
import com.example.paddle.repository.JugadorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;


@SpringBootTest
public class JugadorTest {

    @Autowired
    JugadorRepository jugadorRepository;
    Jugador j = JugadorHelper.genJugador();
	Jugador k = JugadorHelper.genJugador();

		@Test
		public void saveTest() throws NotNullException {

			if(j.getNombre() != null) {
				jugadorRepository.save(j);
				long id = j.getId();

				Jugador jugadorOp = this.jugadorRepository.findById(id);

				assertEquals(jugadorOp.getId(), j.getId());

			}else{
				throw new NotNullException("El jugador no puede tener nombre nulo");
			}


    }
}
