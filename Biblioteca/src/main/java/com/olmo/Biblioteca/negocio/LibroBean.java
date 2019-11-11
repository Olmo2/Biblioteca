package com.olmo.Biblioteca.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="libros")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class LibroBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idLibro;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="num_pags")
	private int pags;
	
	@Column(name="editorial")
	private String editorial;
	
	@Column(name="ISBN")
	private String isbn;
	
	@ManyToMany(mappedBy="libros",cascade=CascadeType.MERGE)
	List<AutorBean> autores = new ArrayList<AutorBean>();
	
	public void addAutor(AutorBean autor) {
		
		if(!autores.contains(autor)) {
			
			autores.add(autor);
			
			// decirle al autor que añada este libro
			List<LibroBean> libros = autor.getLibros();
			if(!libros.contains(this)) {
				
				libros.add(this);
			}
		
		}
	}
	
	@OneToMany(mappedBy="libro")
	List<EjemplarBean> ejemplares = new ArrayList<EjemplarBean>();
	
	public void addEjemplar(EjemplarBean ejemplar) {
		
		if(!ejemplares.contains(ejemplar)) {
			
			ejemplares.add(ejemplar);
			ejemplar.setLibro(this);
		}
	}

	public long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(long idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPags() {
		return pags;
	}

	public void setPags(int pags) {
		this.pags = pags;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public List<AutorBean> getAutores() {
		return autores;
	}

	public void setAutores(List<AutorBean> autores) {
		this.autores = autores;
	}

	public List<EjemplarBean> getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(List<EjemplarBean> ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	

}
