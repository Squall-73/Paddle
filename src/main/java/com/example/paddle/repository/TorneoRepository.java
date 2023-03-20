package com.example.paddle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.paddle.entities.*;

import java.util.List;


@Repository
//Indico que es un repositorio y habilito los metodos principales select, create, update, delete

public interface TorneoRepository extends JpaRepository<Torneo,Integer> {

    List<Torneo> findById(int id);
    
}
