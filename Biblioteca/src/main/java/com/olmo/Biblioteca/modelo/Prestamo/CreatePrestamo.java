package com.olmo.Biblioteca.modelo.Prestamo;

import javax.persistence.EntityManager;

import com.olmo.Biblioteca.negocio.PrestamoBean;
import com.olmo.Biblioteca.util.ConnectionEntityManagerFactory;

public class CreatePrestamo {
public void create(PrestamoBean prestamo) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(prestamo);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
