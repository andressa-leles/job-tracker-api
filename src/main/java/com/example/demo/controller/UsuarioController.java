package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
    public List<Usuario> listar() {
        return repository.findAll();
    }
	
	@PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

}
