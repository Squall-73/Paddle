package com.example.paddle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.paddle.entities.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//Indico que es un repositorio y habilito los metodos principales select, create, update, delete
public interface SetsRepository extends JpaRepository<Sets,Integer> {
    List<Sets> findByID(int id);
}
