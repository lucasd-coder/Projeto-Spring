package com.projetoSpring.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.dspesquisa.entities.Game;

public interface GenreRepository extends JpaRepository<Game, Long> {

}
