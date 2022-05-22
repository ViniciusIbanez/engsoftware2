package com.projects.praticandoAPI.repository;

import com.projects.praticandoAPI.modelo.Biblioteca;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
    
}
