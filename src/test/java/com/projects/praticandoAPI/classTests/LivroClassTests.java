package com.projects.praticandoAPI.classTests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.projects.praticandoAPI.modelo.Livro;

public class LivroClassTests {
    @Test
    public void testCriarLivroValido(){
        final String tituloEsperado = "O Médico e o Monstro";
        final String autorEsperado = "Robert Louis Stevenson";
        final Livro instancia = new Livro(tituloEsperado, autorEsperado);
        final String tituloObtido = instancia.getTitulo();
        final String autorObtido = instancia.getAutor();
        assertEquals(autorEsperado, autorObtido);
        assertEquals(tituloEsperado, tituloObtido);
    }
    @Test
    public void testCriarLivroValidoELerRealidadeAumentada(){
        final String tituloEsperado = "O Médico e o Monstro";
        final String autorEsperado = "Robert Louis Stevenson";
        final String realidadeAumentadaEsperada = "Aqui está a realidade aumentada do livro: O Médico e o Monstro";
        final Livro instancia = new Livro(tituloEsperado, autorEsperado);
        final String tituloObtido = instancia.getTitulo();
        final String autorObtido = instancia.getAutor();
        final String realidadeAumentadaObtida = instancia.getRealidadeAumentada();
        assertEquals(autorEsperado, autorObtido);
        assertEquals(tituloEsperado, tituloObtido);
        assertEquals(realidadeAumentadaEsperada, realidadeAumentadaObtida);
    }
}
