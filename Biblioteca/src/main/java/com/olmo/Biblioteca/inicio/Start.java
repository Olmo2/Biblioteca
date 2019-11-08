package com.olmo.Biblioteca.inicio;

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
		
		EjemplarBean c1 = new EjemplarBean();
		c1.setLoc("Biblioteca El Fontán");
		
		EjemplarBean a1 = new EjemplarBean();
		a1.setLoc("Biblioteca El Fontán");
		
		
		
		
		
		
		

	}

}
