package com.olmo.Biblioteca.inicio;

import com.olmo.Biblioteca.modelo.Autor.CreateAutor;
import com.olmo.Biblioteca.modelo.Ejemplar.CreateEjemplar;
import com.olmo.Biblioteca.modelo.Libro.CreateLibro;
import com.olmo.Biblioteca.modelo.Prestamo.CreatePrestamo;
import com.olmo.Biblioteca.modelo.Usuario.CreateUsuario;
import com.olmo.Biblioteca.negocio.*;

public class Start {

	public static void main(String[] args) {
		
		/*
		 * ********************************
		 * C R E A N D O    O B J E T O S
		 * ********************************
		 */
		
		LibroBean quijote = new LibroBean();
		quijote.setTitulo("El Quijote");
		
		LibroBean harrypotter1 = new LibroBean();
		harrypotter1.setTitulo("Harry Potter y La Piedra Filosofal");
	
		LibroBean harrypotter2 = new LibroBean();
		harrypotter2.setTitulo("Harry Potter y La Camara de los secretos");

		LibroBean harrypotter3 = new LibroBean();
		harrypotter3.setTitulo("Harry Potter y El Prisionero de Azkaban");
	
		LibroBean autoestopista = new LibroBean();
		autoestopista.setTitulo("La guía del autoestopista galáctico");
		
		
		
		AutorBean cervantes = new AutorBean();
		cervantes.setNombre("Miguel de Cevantes");

		AutorBean jkrowling = new AutorBean();
		jkrowling.setNombre("J.K Rowling");
		

		AutorBean douglas = new AutorBean();
		douglas.setNombre("Douglas Adams");
		
		
		//Luego metodos add
		EjemplarBean hp11 = new EjemplarBean();
		hp11.setLoc("Biblioteca El Fontán");
		
		EjemplarBean hp12 = new EjemplarBean();
		hp12.setLoc("Biblioteca El Fontán");
		
		EjemplarBean hp13 = new EjemplarBean();
		hp13.setLoc("Villa Madalena");
		
		EjemplarBean hp21 = new EjemplarBean();
		hp21.setLoc("Biblioteca El Fontán");
		
		EjemplarBean hp31 = new EjemplarBean();
		hp31.setLoc("Biblioteca El Fontán");
		
		EjemplarBean q1 = new EjemplarBean();
		q1.setLoc("Biblioteca El Fontán");
		
		EjemplarBean a1 = new EjemplarBean();
		a1.setLoc("Biblioteca El Fontán");
		
		
		
		//Luego metodos Add
		UsuarioBean paco = new UsuarioBean();
		paco.setNombre("Paco");
		
		UsuarioBean olmo = new UsuarioBean();
		olmo.setNombre("Olmo");
		
		UsuarioBean laura = new UsuarioBean();
		laura.setNombre("Laura");
		
			
		PrestamoBean prestamo1 = new PrestamoBean();
		prestamo1.setFechaPrestamo("El putísimo 10 de noviembre");
//		prestamo1.setEjemplar(a1);
//		prestamo1.setUsuario(laura);
		
		PrestamoBean prestamo2 = new PrestamoBean();
		prestamo2.setFechaPrestamo("El putísimo 28 de abril");
//		prestamo2.setEjemplar(hp11);
//		prestamo2.setUsuario(olmo);
		
		
		
		/*
		 * **************************************************
		 * A Ñ A D I E N D O    I N F O R M A C I Ó N
		 * **************************************************
		 */
		
		quijote.addAutor(cervantes);
		harrypotter1.addAutor(jkrowling);
		harrypotter2.addAutor(jkrowling);
		harrypotter3.addAutor(jkrowling);
		autoestopista.addAutor(douglas);
		
		
		quijote.addEjemplar(q1);
		harrypotter1.addEjemplar(hp11);
		harrypotter1.addEjemplar(hp12);
		harrypotter1.addEjemplar(hp13);
		harrypotter2.addEjemplar(hp21);
		harrypotter3.addEjemplar(hp31);
		autoestopista.addEjemplar(a1);
		
		
		q1.addPrestamo(prestamo1);
		hp11.addPrestamo(prestamo2);
		laura.addPrestamo(prestamo1);
		olmo.addPrestamo(prestamo2);
		
		
//		paco.addEjemplar(hp11);
//		paco.addEjemplar(hp31);
//		olmo.addEjemplar(hp21);
//		laura.addEjemplar(a1);
//		laura.addEjemplar(q1);
//		
		
		
		

		/*
		 * **************************************************
		 * P E R S I S T I E N D O    L O S     D A T O S
		 * **************************************************
		 */
		
		
		/*
		 * 
		 * COMO HAY UN ALL EN AUTORBEAN NO LO PERSISTO
		 * 
		 * 
		 * */
		
		
		
//		CreateLibro createLibro = new CreateLibro();
//		createLibro.create(autoestopista);
//		createLibro.create(quijote);
//		createLibro.create(harrypotter1);
//		createLibro.create(harrypotter2);
//		createLibro.create(harrypotter3);
		
		CreateAutor createAutor = new CreateAutor();
		createAutor.create(cervantes);
		createAutor.create(douglas);
		createAutor.create(jkrowling);
		
		
		
		
		CreateEjemplar createEjemplar = new CreateEjemplar();
		createEjemplar.create(a1);
		createEjemplar.create(q1);
		createEjemplar.create(hp31);
		createEjemplar.create(hp21);
		createEjemplar.create(hp13);
		createEjemplar.create(hp12);
		createEjemplar.create(hp11);
////		

		
		
		CreateUsuario createUsuario = new CreateUsuario();
		createUsuario.create(laura);
		createUsuario.create(olmo);
		createUsuario.create(paco);
		
		CreatePrestamo createPrestamo = new CreatePrestamo();
		createPrestamo.create(prestamo1);
		createPrestamo.create(prestamo2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
