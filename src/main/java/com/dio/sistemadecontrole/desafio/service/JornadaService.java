package com.dio.sistemadecontrole.desafio.service;

import com.dio.sistemadecontrole.desafio.model.JornadaTrabalho;
import com.dio.sistemadecontrole.desafio.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    //salva nova entrada de jornada de trabalho
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    //atualiza jornada de trabalho
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    //deleta jornada pelo id
    public void deleteJornada(Long IdJornada){
        jornadaRepository.deleteById(IdJornada);
    }

    //deleta TODAS jornadas
    public void deleteTodasJornada(){
        jornadaRepository.deleteAll();
    }

    //retorna lista de jornadas de trabalho
    public List<JornadaTrabalho> findAll(){
        return jornadaRepository.findAll();
    }

    //encontra jornada pelo id
    public Optional<JornadaTrabalho> findById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }
}
