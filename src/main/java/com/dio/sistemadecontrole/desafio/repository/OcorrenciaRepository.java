package com.dio.sistemadecontrole.desafio.repository;

import com.dio.sistemadecontrole.desafio.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}