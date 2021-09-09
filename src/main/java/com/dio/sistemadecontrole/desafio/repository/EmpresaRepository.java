package com.dio.sistemadecontrole.desafio.repository;

import com.dio.sistemadecontrole.desafio.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}