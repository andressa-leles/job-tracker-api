package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Empresa;
import com.example.demo.repository.EmpresaRepository;

@RestController
@RequestMapping("/empresas")
@CrossOrigin(origins = "*")
public class EmpresaController {

    @Autowired
    private EmpresaRepository repository;

    @GetMapping
    public List<Empresa> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Empresa criar(@RequestBody Empresa empresa) {
        return repository.save(empresa);
    }
}