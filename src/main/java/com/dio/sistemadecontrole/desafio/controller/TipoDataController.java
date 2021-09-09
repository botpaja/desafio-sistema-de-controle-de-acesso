package com.dio.sistemadecontrole.desafio.controller;

import com.dio.sistemadecontrole.desafio.model.TipoData;
import com.dio.sistemadecontrole.desafio.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tipoData")
public class TipoDataController {

    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData) {
        return tipoDataService.saveTipoData(tipoData);
    }
    @GetMapping
    public List<TipoData> getTipoDataList() {
        return tipoDataService.findAll();
    }
    @GetMapping("/{idTipoData}")
    public java.util.Optional<TipoData> geTipoDataById(@PathVariable("idTipoData") Long idTipoData) {
        return tipoDataService.getById(idTipoData);
    }
    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData) {
        return tipoDataService.updateTipoData(tipoData);
    }
    @DeleteMapping("/{idTipoData}")
    public void deleteByID(@PathVariable("idTipoData") Long idTipoData) {
        tipoDataService.deleteTipoData(idTipoData);
    }
}
