package com.projects.praticandoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.praticandoAPI.modelo.Topico;
import java.util.List;


public interface TopicoRepository extends JpaRepository<Topico, Long> {
	List<Topico> findByCursoNome(String nomeCurso);
	

}
