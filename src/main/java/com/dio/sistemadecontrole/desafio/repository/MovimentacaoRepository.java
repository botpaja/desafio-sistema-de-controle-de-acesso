package com.dio.sistemadecontrole.desafio.repository;

import com.dio.sistemadecontrole.desafio.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}