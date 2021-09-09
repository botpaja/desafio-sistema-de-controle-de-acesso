package com.dio.sistemadecontrole.desafio.repository;


import com.dio.sistemadecontrole.desafio.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}