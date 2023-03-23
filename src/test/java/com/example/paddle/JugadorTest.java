package com.example.paddle;

import com.example.paddle.entities.Jugador;
import com.example.paddle.repository.JugadorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;





@SpringBootTest
public class JugadorTest {

    @Autowired
    JugadorRepository repository;
    @Test
    public void saveTest(){

        Jugador j = new Jugador();
        Jugador k = new Jugador();
        j.genJugador(j);
        k.genJugador(k);
        repository.save(j);
        repository.save(k);

        assertEquals(k.getEdad(),j.getEdad());

    }
}
