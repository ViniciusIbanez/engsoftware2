package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Curso;
import com.projects.praticandoAPI.modelo.Topico;
import com.projects.praticandoAPI.modelo.Usuario;
import com.projects.praticandoAPI.repository.CursoRepository;
import com.projects.praticandoAPI.repository.UsuarioRepository;

public class UsuarioForm {
	
	private String nome;
	private String email;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Usuario converter(UsuarioRepository usuarioRepository) {
		
		return new Usuario(nome, email, senha);
	}
}
