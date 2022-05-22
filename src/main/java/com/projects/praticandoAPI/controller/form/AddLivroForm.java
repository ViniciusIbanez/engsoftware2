package com.projects.praticandoAPI.controller.form;

import java.util.Optional;

import com.projects.praticandoAPI.modelo.Biblioteca;
import com.projects.praticandoAPI.modelo.Livro;
import com.projects.praticandoAPI.repository.BibliotecaRepository;
import com.projects.praticandoAPI.repository.LivroRepository;

public class AddLivroForm {
    private long idBiblioteca;
    private long idLivro;

    public long getIdBiblioteca() {
        return idBiblioteca;
    }
    public long getIdLivro() {
        return idLivro;
    }
    public void setIdLivro(long idLivro) {
        this.idLivro = idLivro;
    }
    public void setIdBiblioteca(long idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public Biblioteca converter(LivroRepository livroRepository, BibliotecaRepository bibliotecaRepository){
        Optional<Biblioteca> biblioteca = bibliotecaRepository.findById(idBiblioteca);
        Optional<Livro> livro = livroRepository.findById(idLivro);
        if(biblioteca.isPresent() && livro.isPresent()){
            biblioteca.get().addLivro(livro.get());
            return biblioteca.get();
        }
        return new Biblioteca();
    }
    
}
