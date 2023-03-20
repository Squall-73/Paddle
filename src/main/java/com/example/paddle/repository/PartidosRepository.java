package com.example.paddle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.paddle.entities.*;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
//Indico que es un repositorio y habilito los metodos principales select, create, update, delete
public interface PartidosRepository extends JpaRepository<Partidos, Integer> {

    List<Partidos>  findById(int id);


}
