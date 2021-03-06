package com.projects.praticandoAPI.controller.dto;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.projects.praticandoAPI.modelo.Biblioteca;
import com.projects.praticandoAPI.modelo.Livro;
import com.projects.praticandoAPI.modelo.Usuario;

public class BibliotecaDto {
    
    private Long id;
    private Usuario usuario;
    private Set<Livro> livros;

    public BibliotecaDto(Biblioteca biblioteca){
        super();
        this.id = biblioteca.getId();
        this.usuario = biblioteca.getUsuario();
        this.livros = biblioteca.getLivros();
    }

    public Set<Livro> getLivros() {
        return livros;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Long getId() {
        return id;
    }

    public static List<BibliotecaDto> converter(List<Biblioteca> bibliotecas){
        return bibliotecas.stream().map(BibliotecaDto::new).collect(Collectors.toList());
    }
}
