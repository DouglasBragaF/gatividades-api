package com.gatividades.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatividades.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {

}
