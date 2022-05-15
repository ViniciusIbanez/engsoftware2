package com.projects.praticandoAPI;

import com.projects.praticandoAPI.controller.LivroController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"com.projects.praticandoAPI"})
@SpringBootTest
@AutoConfigureMockMvc


public class UsuarioApiApplicationTests {
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void testCreateUsuario() throws Exception{
        final String expectedEmail = "180131@facens.br";
        final String expectedNome = "Victor Thadeu Santos Marciano";
        final String expectedPlano = "FREE";
        final String expectedSenha = "1234";
        mockMvc
            .perform(MockMvcRequestBuilders.post("/usuarios").contentType(MediaType.APPLICATION_JSON).content("{\"email\":\"180131@facens.br\",\"nome\":\"Victor Thadeu Santos Marciano\",\"plano\":\"JUJUBA\",\"senha\":\"1234\"}"))
            .andExpect(MockMvcResultMatchers.status().is(201))
            .andExpect((ResultMatcher) jsonPath("email").value(expectedEmail))
            .andExpect((ResultMatcher) jsonPath("nome").value(expectedNome))
            .andExpect((ResultMatcher) jsonPath("plano").value(expectedPlano))
            .andExpect((ResultMatcher) jsonPath("senha").value(expectedSenha));
    }
}
