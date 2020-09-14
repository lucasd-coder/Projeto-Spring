package com.projetoSpring.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.dspesquisa.entities.Genre;

public interface GameRepository extends JpaRepository<Genre, Long> {

}
