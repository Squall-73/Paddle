package com.example.paddle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.paddle.entities.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
//Indico que es un repositorio y habilito los metodos principales select, create, update, delete
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    List<Jugador> findById(long id);
    //Genera una consulta que busca todos los jugadores de ese pais
    List<Jugador> findByPais(String pais);

    @Query(value = "select e.* from equipo as e " +
            "inner join jugador as j on j.id = e.idJugadorA || j.id = e.idJugadorB where j.id = :id",
            nativeQuery = true)
    List<Equipo> findAllByJugadorId(long id);

}
