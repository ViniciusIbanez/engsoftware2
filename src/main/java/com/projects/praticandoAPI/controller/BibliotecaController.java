package com.projects.praticandoAPI.controller;

import java.net.URI;
import java.util.List;

import com.projects.praticandoAPI.controller.dto.BibliotecaDto;
import com.projects.praticandoAPI.controller.form.BibliotecaForm;
import com.projects.praticandoAPI.modelo.Biblioteca;
import com.projects.praticandoAPI.repository.BibliotecaRepository;
import com.projects.praticandoAPI.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@CrossOrigin
@RequestMapping("/bibliotecas")
public class BibliotecaController {
    @Autowired
    private BibliotecaRepository bibliotecaRepository;
    @Autowired
	private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<BibliotecaDto> lista() {
        List<Biblioteca> bibliotecas = bibliotecaRepository.findAll();
        return BibliotecaDto.converter(bibliotecas);
    }

    @PostMapping
    public ResponseEntity<BibliotecaDto> criar(@RequestBody BibliotecaForm form, UriComponentsBuilder uriBuilder){
        Biblioteca biblioteca = form.converter(usuarioRepository);
        bibliotecaRepository.save(biblioteca);

        URI uri = uriBuilder.path("/bibliotecas/{id}").buildAndExpand(biblioteca.getId()).toUri();
        return ResponseEntity.created(uri).body(new BibliotecaDto(biblioteca));
    }
}
