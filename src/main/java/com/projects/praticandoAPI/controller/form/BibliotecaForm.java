package com.projects.praticandoAPI.controller.form;

import java.util.Optional;

import com.projects.praticandoAPI.modelo.Biblioteca;
import com.projects.praticandoAPI.modelo.Usuario;
import com.projects.praticandoAPI.repository.UsuarioRepository;

public class BibliotecaForm {

    private long idUsuario;

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Biblioteca converter(UsuarioRepository usuarioRepository){
        Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
        if(usuario.isPresent()){
			return new Biblioteca(usuario.get());
		}
        return new Biblioteca();
    }

}
