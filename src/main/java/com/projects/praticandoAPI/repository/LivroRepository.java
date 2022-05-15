package com.projects.praticandoAPI.repository;

import com.projects.praticandoAPI.modelo.Livro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
}