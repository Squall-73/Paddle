package com.example.paddle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.paddle.entities.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
//Indico que es un repositorio y habilito los metodos principales select, create, update, delete
public interface JugadorRepository extends JpaRepository<Jugador, Integer> {

    List<Jugador> findById(int id);
    //Genera una consulta que busca todos los jugadores de ese pais
    List<Jugador> findByPais(String pais);

}
