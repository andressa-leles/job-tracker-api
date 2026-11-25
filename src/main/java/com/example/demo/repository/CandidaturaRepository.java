package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Candidatura;

public interface CandidaturaRepository extends JpaRepository<Candidatura, Integer> {
}