package com.projects.praticandoAPI.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String titulo;
    private String autor;

	/**
	 * Cria uma classe livro vazia
	 */
    public Livro(){

    }
	/**
	 * Cria um novo livro
	 * @param titulo
	 * @param autor
	 */
    public Livro(String titulo, String autor){
        super();
		this.titulo = titulo;
		this.autor = autor;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRealidadeAumentada(){
        String relalidadeAumentadaMock = "Aqui está a realidade aumentada do livro: ";
        return relalidadeAumentadaMock+this.getTitulo();
    }

}
