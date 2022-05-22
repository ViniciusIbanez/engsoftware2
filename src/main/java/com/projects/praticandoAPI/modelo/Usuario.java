package com.projects.praticandoAPI.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Usuario {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	private String nome;
	private String email;
	private String senha;
	private String plano;
	private Long moedas;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Biblioteca biblioteca;

	public Usuario() {
	}



	public Biblioteca getBiblioteca() {
		return biblioteca;
	}



	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}



	/**
	 * Cria um novo objeto de usuário com suas informações preenchidas
	 * @param nome
	 * @param email
	 * @param senha
	 * @param plano
	 */
	public Usuario(String nome, String email, String senha, String plano) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
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
		this.setMoedas(this.plano);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
	if (this == obj)
		return true;
		if (obj == null)
		return false;
		if (getClass() != obj.getClass())
		return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
			return false;
		} else if (!id.equals(other.id))
		return false;
		return true;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
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
	
	public void setSenha(String senha) {
	this.senha = senha;
	}

	public Long getMoedas() {
		return this.moedas;
	}

	public void setMoedas(String plano){
		switch (this.plano) {
			case "FREE":
				this.moedas = (long) 0;
				break;
			case "PREMIUM":
				this.moedas = (long) 10;
				break;
			case "VIP":
				this.moedas = (long) 100;
				break;
		
			default:
				this.moedas = (long) 0;
				break;
		}
	}

	public void setMoedas(String operacao, long valor){
		switch (operacao) {
			case "add":
				this.moedas += valor;
				break;
			case "remove":
				if ((long)(this.moedas -= valor) >= 0){
					this.moedas -= valor;
				}
				break;
			default:
				break;
		}
	}
}
