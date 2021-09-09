package com.dio.sistemadecontrole.desafio.controller;

import com.dio.sistemadecontrole.desafio.model.Ocorrencia;
import com.dio.sistemadecontrole.desafio.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }
    @GetMapping
    public List<Ocorrencia> getOcorrenciaList() {
        return ocorrenciaService.findAll();
    }
    @GetMapping("/{idOcorrencia}")
    public java.util.Optional<Ocorrencia> getOcorrenciaById(@PathVariable("idOcorrencia") Long idOcorencia) {
        return ocorrenciaService.getById(idOcorencia);
    }
    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }
    @DeleteMapping("/{idOcorrencia}")
    public void deleteByID(@PathVariable("idOcorrencia") Long idOcorrencia) {
        ocorrenciaService.deleteOcorrencia(idOcorrencia);
    }
}
