package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Usuario;
import com.projects.praticandoAPI.repository.UsuarioRepository;

public class UsuarioForm {
	
	private String nome;
	private String email;
	private String senha;
	private String plano;
	private long moedas;

	public long getMoedas(){
		return this.moedas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		switch (plano.toUpperCase()) {
			case "VIP":
				this.plano = "VIP";
				break;
			case "PREMIUM":
				this.plano = "PREMIUM";
				break;
			default:
				this.plano = "FREE";
				break;
		}
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
	
	public void setMoedas(long moedas){
		this.moedas = moedas;
	}

	public Usuario converter(UsuarioRepository usuarioRepository) {
		
		return new Usuario(nome, email, senha, plano);
	}
}
