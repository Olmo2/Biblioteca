package com.olmo.Biblioteca.negocio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="prestamos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PrestamoBean {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idPrestamo;
	
	
	@ManyToOne(cascade=CascadeType.MERGE)
	private UsuarioBean usuario;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private EjemplarBean ejemplar;
	
	@Column(name="fecha_prestamo")
	private String fechaPrestamo;
	
	@Column(name="fecha_devolucion")
	private String fechaDevolucion;

	

	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}

	public EjemplarBean getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(EjemplarBean ejemplar) {
		this.ejemplar = ejemplar;
	}

	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	
	
}
