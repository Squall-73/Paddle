package com.example.paddle.repository;


import com.example.paddle.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;


@Repository
//Indico que es un repositorio y habilito los metodos principales select, create, update, delete
public interface TipoTorneoRepository extends JpaRepository<TipoTorneo,Long> {


    TipoTorneo findById(long id);

}
