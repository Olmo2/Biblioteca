package com.olmo.Biblioteca.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="prestamos")
public class PrestamoBean {
	
	@Id
	@OneToMany(mappedBy="idUsuario")
	List<UsuarioBean> usuarios = new ArrayList<UsuarioBean>();
	
	@Id
	@OneToMany(mappedBy="idEjemplar")
	List<EjemplarBean> ejemplares = new ArrayList<EjemplarBean>();
	
	

}
