package com.projetoSpring.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
