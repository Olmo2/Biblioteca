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
import javax.persistence.Table;

@Entity
@Table(name="autores")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AutorBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idAutor;
	
	@Column(name="nombre")
	private String nombre;
	
	
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<LibroBean> libros = new ArrayList<LibroBean>();
	
	/*METODO ADD EMN LA CLASE LIBROBEAN*/


	public long getIdAutor() {
		return idAutor;
	}


	public void setIdAutor(long idAutor) {
		this.idAutor = idAutor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<LibroBean> getLibros() {
		return libros;
	}


	public void setLibros(List<LibroBean> libros) {
		this.libros = libros;
	}
	
	
	
	
	
	


}
