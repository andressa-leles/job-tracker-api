package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Candidatura;
import com.example.demo.repository.CandidaturaRepository;

@RestController
@RequestMapping("/candidaturas")
@CrossOrigin(origins = "*")
public class CandidaturaController {

    @Autowired
    private CandidaturaRepository repository;

    // 1. Listar todas as candidaturas (GET /candidaturas)
    @GetMapping
    public List<Candidatura> listar() {
        return repository.findAll();
    }

    // 2. Cadastrar nova candidatura (POST /candidaturas)
    @PostMapping
    public Candidatura criar(@RequestBody Candidatura candidatura) {
        return repository.save(candidatura);
    }

    // 3. Atualizar candidatura existente (PUT /candidaturas/1)
    @PutMapping("/{id}")
    public Candidatura atualizar(@PathVariable Integer id, @RequestBody Candidatura dadosAtualizados) {
        dadosAtualizados.setId(id);
        return repository.save(dadosAtualizados);
    }

    // 4. Excluir candidatura (DELETE /candidaturas/1)
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}