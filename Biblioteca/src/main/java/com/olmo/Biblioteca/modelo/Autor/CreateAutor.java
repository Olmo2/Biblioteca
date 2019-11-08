package com.olmo.Biblioteca.modelo.Autor;

import javax.persistence.EntityManager;

import com.olmo.Biblioteca.negocio.AutorBean;
import com.olmo.Biblioteca.util.ConnectionEntityManagerFactory;



public class CreateAutor {
	
public void create(AutorBean autor) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(autor);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
