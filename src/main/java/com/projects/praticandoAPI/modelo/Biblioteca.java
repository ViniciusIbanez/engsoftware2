package com.projects.praticandoAPI.modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Biblioteca {
    @Id
    @Column(name="usuario_id")
    private Long id;

    @OneToOne(mappedBy = "biblioteca")
    @MapsId
    @JoinColumn(name= "usuario_id")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
        name = "livro_biblioteca",
        joinColumns = @JoinColumn(name = "biblioteca_id"),
        inverseJoinColumns = @JoinColumn(name = "livro_id")
    )
    Set<Livro> livros;

    public Biblioteca(){
    }

    public Biblioteca(Usuario usuario){
        super();
        this.usuario = usuario;
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
		Biblioteca other = (Biblioteca) obj;
		if (id == null) {
			if (other.id != null)
			return false;
		} else if (!id.equals(other.id))
		return false;
		return true;
	}


    public Long getId(){
        return this.id;
    }

    public Usuario getUsuario(){
        return this.usuario; 
    }

    public void addLivro(Livro livro){
        livro.addBiblioteca(this);
        this.livros.add(livro);
    }


    public Set<Livro> getLivros(){
        return this.livros;
    } 
}
