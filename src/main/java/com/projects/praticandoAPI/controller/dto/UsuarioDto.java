package com.projects.praticandoAPI.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.projects.praticandoAPI.modelo.Usuario;

public class UsuarioDto {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String plano;
	private long moedas;
	
	
	public UsuarioDto(Usuario usuario) {
		super();
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
		this.plano = usuario.getPlano();
		this.moedas = (long) usuario.getMoedas();
	}

	public long getMoedas() {
		return moedas;
	}


	public String getPlano() {
		return plano;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
	
	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}
	
}
