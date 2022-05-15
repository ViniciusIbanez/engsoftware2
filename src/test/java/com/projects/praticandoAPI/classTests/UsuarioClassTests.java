package com.projects.praticandoAPI.classTests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.projects.praticandoAPI.modelo.Usuario;


public class UsuarioClassTests {
    @Test
    public void testCriarUsuarioFree(){
        final String expectedEmail = "180131@facens.br";
        final String expectedNome = "Victor Thadeu Santos Marciano";
        final String expectedPlano = "FREE";
        final String expectedSenha = "1234";
        final Long expctedMoedas = (long) 0;
        final String givenEmail = "180131@facens.br";
        final String givenNome = "Victor Thadeu Santos Marciano";
        final String givenPlano = "FREE";
        final String givenSenha = "1234";
        final Usuario instancia = new Usuario(givenNome, givenEmail, givenSenha, givenPlano);
        assertEquals(expectedEmail, instancia.getEmail());
        assertEquals(expectedNome, instancia.getNome());
        assertEquals(expectedSenha, instancia.getSenha());
        assertEquals(expectedPlano, instancia.getPlano());
        assertEquals(0L, (long) instancia.getMoedas());
    }
    @Test
    public void testCriarUsuarioPremium(){
        final String expectedEmail = "180131@facens.br";
        final String expectedNome = "Victor Thadeu Santos Marciano";
        final String expectedPlano = "PREMIUM";
        final String expectedSenha = "1234";
        final String givenEmail = "180131@facens.br";
        final String givenNome = "Victor Thadeu Santos Marciano";
        final String givenPlano = "PREMIUM";
        final String givenSenha = "1234";
        final Usuario instancia = new Usuario(givenNome, givenEmail, givenSenha, givenPlano);
        assertEquals(expectedEmail, instancia.getEmail());
        assertEquals(expectedNome, instancia.getNome());
        assertEquals(expectedSenha, instancia.getSenha());
        assertEquals(expectedPlano, instancia.getPlano());
        assertEquals(10L, (long) instancia.getMoedas());
    }
    @Test
    public void testCriarUsuarioVip(){
        final String expectedEmail = "180131@facens.br";
        final String expectedNome = "Victor Thadeu Santos Marciano";
        final String expectedPlano = "VIP";
        final String expectedSenha = "1234";
        final String givenEmail = "180131@facens.br";
        final String givenNome = "Victor Thadeu Santos Marciano";
        final String givenPlano = "VIP";
        final String givenSenha = "1234";
        final Usuario instancia = new Usuario(givenNome, givenEmail, givenSenha, givenPlano);
        assertEquals(expectedEmail, instancia.getEmail());
        assertEquals(expectedNome, instancia.getNome());
        assertEquals(expectedSenha, instancia.getSenha());
        assertEquals(expectedPlano, instancia.getPlano());
        assertEquals(100L, (long) instancia.getMoedas());
    }
    @Test
    public void testCriarUsuarioDefault(){
        final String expectedEmail = "180131@facens.br";
        final String expectedNome = "Victor Thadeu Santos Marciano";
        final String expectedPlano = "FREE";
        final String expectedSenha = "1234";
        final String givenEmail = "180131@facens.br";
        final String givenNome = "Victor Thadeu Santos Marciano";
        final String givenPlano = "FOO";
        final String givenSenha = "1234";
        final Usuario instancia = new Usuario(givenNome, givenEmail, givenSenha, givenPlano);
        assertEquals(expectedEmail, instancia.getEmail());
        assertEquals(expectedNome, instancia.getNome());
        assertEquals(expectedSenha, instancia.getSenha());
        assertEquals(expectedPlano, instancia.getPlano());
        assertEquals(0L, (long) instancia.getMoedas());
    }
}
