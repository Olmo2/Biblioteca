package com.olmo.Biblioteca.modelo.Ejemplar;

import javax.persistence.EntityManager;

import com.olmo.Biblioteca.negocio.EjemplarBean;
import com.olmo.Biblioteca.util.ConnectionEntityManagerFactory;

public class CreateEjemplar {
	
public void create(EjemplarBean ejemplar) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(ejemplar);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
