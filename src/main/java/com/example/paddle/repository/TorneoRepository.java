package com.example.paddle.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.paddle.entities.*;

import java.util.Optional;

@Repository
//indico que esun repositorio y habilito los metodos principales select, create, update, delete
public interface TorneoRepository extends JpaRepository<Torneo,Integer> {

    Optional<Torneo> findByNombre_torneo(String nombre_torneo);
    boolean existsByNombre_torneo(String nombre_torneo);

}
