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
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class UsuarioBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idUsusario;

	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy="ejemplar")
	
	List<PrestamoBean> prestamos =new ArrayList<PrestamoBean>();
	
public void addPrestamo(PrestamoBean prestamo) {
		
		if(!prestamos.contains(prestamo)) {
			
			prestamos.add(prestamo);
			prestamo.setUsuario(this);
		}
	}
//	
//	@ManyToMany(mappedBy="usuarios",cascade = CascadeType.ALL)
//	List<EjemplarBean> ejemplares = new ArrayList<EjemplarBean>();
//	
//	public void addEjemplar(EjemplarBean ejemplar) {
//
//		if (!ejemplares.contains(ejemplar)) {
//
//			ejemplares.add(ejemplar);
//
//			// decirle al coche que añada este concesionario
//			List<UsuarioBean> usuarios = ejemplar.getUsuarios();
//			if (!usuarios.contains(this)) {
//
//				usuarios.add(this);
//			}
//		
//		}
//	}

	public long getIdUsusario() {
		return idUsusario;
	}

	public void setIdUsusario(long idUsusario) {
		this.idUsusario = idUsusario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//	public List<EjemplarBean> getEjemplares() {
//		return ejemplares;
//	}
//
//	public void setEjemplares(List<EjemplarBean> ejemplares) {
//		this.ejemplares = ejemplares;
//	}
	
	
}
