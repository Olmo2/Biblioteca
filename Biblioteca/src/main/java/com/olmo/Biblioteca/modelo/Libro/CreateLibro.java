package com.olmo.Biblioteca.modelo.Libro;

import javax.persistence.EntityManager;

import com.olmo.Biblioteca.negocio.LibroBean;
import com.olmo.Biblioteca.util.ConnectionEntityManagerFactory;

public class CreateLibro {
public void create(LibroBean autor) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(autor);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
