package com.iwcn.master.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.iwcn.master.model.Pelicula;

public class PeliculaTest {

	@Test
	public void testCompleto() {
		Pelicula p = new Pelicula("tt0800369", "Thor", "2011", "https://images-na.ssl-images-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg");
		assertEquals(p.getImdbID(), "tt0800369");
		assertEquals(p.getTitle(), "Thor");
		assertEquals(p.getYear(), "2011");
		assertEquals(p.getPoster(), "https://images-na.ssl-images-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg");
		imprimir("Se verifica que se crea un producto completo");
	}
	
	@Test
	public void testVacio() {
		Pelicula p = new Pelicula();
		assertEquals(p.getImdbID(), null);
		assertEquals(p.getTitle(), null);
		assertEquals(p.getYear(), null);
		assertEquals(p.getPoster(), null);
		imprimir("Se verifica que se crea un producto");
	}

	@Test
	public void testSetImdbID() {
		Pelicula p = new Pelicula();
		p.setImdbID("tt0800369");
		assertEquals("tt0800369", p.getImdbID());
		imprimir("Se verifica que se inserta el 'ImdbId'");
	}
	
	@Test
	public void testSetTitle() {
		Pelicula p = new Pelicula();
		p.setTitle("Thor");
		assertEquals("Thor", p.getTitle());
		imprimir("Se verifica que se inserta el 'Titulo'");
	}
	
	@Test
	public void testSetYear() {
		Pelicula p = new Pelicula();
		p.setYear("2011");
		assertEquals("2011", p.getYear());
		imprimir("Se verifica que se inserta el 'Año'");
	}
	
	@Test
	public void testSetPoster() {
		Pelicula p = new Pelicula();
		p.setPoster("https://images-na.ssl-images-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg");
		assertEquals("https://images-na.ssl-images-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg", p.getPoster());
		imprimir("Se verifica que se inserta el 'Poster'");
	}
	
	private static void imprimir(String text) {
		System.out.println(text);
	}
		
}
