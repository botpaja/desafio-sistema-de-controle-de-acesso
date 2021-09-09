package com.dio.sistemadecontrole.desafio.controller;


import com.dio.sistemadecontrole.desafio.model.BancoHoras;
import com.dio.sistemadecontrole.desafio.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancoHoras")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.saveBancoHoras(bancoHoras);
    }
    @GetMapping
    public List<BancoHoras> getBancoHorasList() {
        return bancoHorasService.findAll();
    }
    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.updateBancoHoras(bancoHoras);
    }
}
