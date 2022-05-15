package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Livro;
import com.projects.praticandoAPI.repository.LivroRepository;

public class LivroForm {
    
    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro converter(LivroRepository livroRepository){
        return new Livro(titulo, autor);
    }

}
