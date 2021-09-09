package com.dio.sistemadecontrole.desafio.service;


import com.dio.sistemadecontrole.desafio.model.BancoHoras;
import com.dio.sistemadecontrole.desafio.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoHorasService {
    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }
    public BancoHoras saveBancoHoras(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }
    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }
    public BancoHoras updateBancoHoras(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }
}
