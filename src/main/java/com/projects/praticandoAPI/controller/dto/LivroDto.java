package com.projects.praticandoAPI.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.projects.praticandoAPI.modelo.Livro;

public class LivroDto {
    private Long id;
    private String titulo;
    private String autor;

    public LivroDto(Livro livro){
        super();
        this.id = livro.getId();
        this.titulo = livro.getTitulo();
        this.autor = livro.getAutor();
    }

    public String getAutor() {
        return autor;
    }


    public String getTitulo() {
        return titulo;
    }


    public Long getId() {
        return id;
    }
    

    public static List<LivroDto> converter(List<Livro> livros) {
		return livros.stream().map(LivroDto::new).collect(Collectors.toList());
	}
}
