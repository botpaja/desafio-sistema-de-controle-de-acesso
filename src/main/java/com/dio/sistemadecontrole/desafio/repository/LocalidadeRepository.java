package com.dio.sistemadecontrole.desafio.repository;

import com.dio.sistemadecontrole.desafio.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}