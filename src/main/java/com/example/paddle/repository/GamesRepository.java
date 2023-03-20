package com.example.paddle.repository;


import com.example.paddle.entities.Games;
import com.example.paddle.entities.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//Indico que es un repositorio y habilito los metodos principales select, create, update, delete
public interface GamesRepository extends JpaRepository<Games, Integer> {

    List<Games> findById(int id);
}
