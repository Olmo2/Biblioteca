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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ejemplares")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class EjemplarBean {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idEjemplar;
	
	@Column(name="localizacion")
	private String loc;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private LibroBean libro;
	
	@OneToMany(mappedBy="ejemplar")
	List<PrestamoBean> prestamos = new ArrayList<PrestamoBean>();
	
public void addPrestamo(PrestamoBean prestamo) {
		
		if(!prestamos.contains(prestamo)) {
			
			prestamos.add(prestamo);
			prestamo.setEjemplar(this);
		}
	}
//	@ManyToMany(cascade= CascadeType.ALL)
//	List<UsuarioBean> usuarios = new ArrayList<UsuarioBean>();

	public long getIdEjemplar() {
		return idEjemplar;
	}

	public void setIdEjemplar(long idEjemplar) {
		this.idEjemplar = idEjemplar;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public LibroBean getLibro() {
		return libro;
	}

	public void setLibro(LibroBean libro) {
		this.libro = libro;
	}

//	public List<UsuarioBean> getUsuarios() {
//		return usuarios;
//	}
//
//	public void setUsuarios(List<UsuarioBean> usuarios) {
//		this.usuarios = usuarios;
//	}
	
	
	
	
	
	
}
