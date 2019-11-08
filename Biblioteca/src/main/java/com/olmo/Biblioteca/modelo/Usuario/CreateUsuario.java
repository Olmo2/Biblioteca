package com.olmo.Biblioteca.modelo.Usuario;

import javax.persistence.EntityManager;

import com.olmo.Biblioteca.negocio.UsuarioBean;
import com.olmo.Biblioteca.util.ConnectionEntityManagerFactory;

public class CreateUsuario {
	
public void create(UsuarioBean usuario) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(usuario);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
