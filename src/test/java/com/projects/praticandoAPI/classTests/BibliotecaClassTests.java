package com.projects.praticandoAPI.classTests;

import static org.junit.Assert.assertEquals;

import com.projects.praticandoAPI.modelo.Biblioteca;
import com.projects.praticandoAPI.modelo.Usuario;

import org.junit.Test;

public class BibliotecaClassTests {
    @Test
    public void testeCriarBibliotecaValida(){
        final String givenEmail = "180131@facens.br";
        final String givenNome = "Victor Thadeu Santos Marciano";
        final String givenPlano = "FREE";
        final String givenSenha = "1234";
        final Usuario instancia = new Usuario(givenNome, givenEmail, givenSenha, givenPlano);
        final Biblioteca biblioteca = new Biblioteca(instancia);
        assertEquals(biblioteca.getUsuario(), instancia);
    }
}
