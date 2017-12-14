package com.iwcn.master.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.iwcn.master.model.BusquedaPelicula;
import com.iwcn.master.model.Pelicula;

public class BusquedaPeliculaTest {

	@Test
	public void testCompleto() {
		Pelicula[] p = new Pelicula[10];

		p[0] = new Pelicula ("tt0800369", "Thor", "2011", "https://images-na.ssl-images-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg");
		p[1] = new Pelicula ("tt1981115", "Thor: The Dark World", "2013", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTQyNzAwOTUxOF5BMl5BanBnXkFtZTcwMTE0OTc5OQ@@._V1_SX300.jpg");
		p[2] = new Pelicula ("tt3501632", "Thor: Ragnarok", "2017", "https://images-na.ssl-images-amazon.com/images/M/MV5BMjMyNDkzMzI1OF5BMl5BanBnXkFtZTgwODcxODg5MjI@._V1_SX300.jpg");
		p[3] = new Pelicula ("tt6016776", "Team Thor", "2016", "https://images-na.ssl-images-amazon.com/images/M/MV5BMmY4NzA2OGUtYTc0MS00OTc0LThhYjAtZTJkMTI2MTgyNDY0XkEyXkFqcGdeQXVyNDQ5MDYzMTk@._V1_SX300.jpg");
		p[4] = new Pelicula ("tt1667903", "Thor: Tales of Asgard", "2011", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTcxOTU4NzIxMV5BMl5BanBnXkFtZTcwNzE3NjAxNQ@@._V1_SX300.jpg");
		p[5] = new Pelicula ("tt1792794", "Almighty Thor", "2011", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTcwNjI5MTAzNF5BMl5BanBnXkFtZTcwNTcyOTIwNQ@@._V1_SX300.jpg");
		p[6] = new Pelicula ("tt6599818", "Team Thor: Part 2", "2017", "https://images-na.ssl-images-amazon.com/images/M/MV5BOTJkYmFkM2ItOGIwMS00YWRhLTg5ZGQtNDA0ZjcwNzA3ZjQxXkEyXkFqcGdeQXVyNDQ5MDYzMTk@._V1_SX300.jpg");
		p[7] = new Pelicula ("tt1260572", "Thor: Hammer of the Gods", "2009", "https://images-na.ssl-images-amazon.com/images/M/MV5BNTFkMDA5ODEtMTQ1NC00NGRhLWE3ZGQtOGE5ZGJkMGI1ZDI5XkEyXkFqcGdeQXVyMjI1NjEzNjg@._V1_SX300.jpg");
		p[8] = new Pelicula ("tt1241721", "Thor: Legend of the Magical Hammer", "2011", "https://images-na.ssl-images-amazon.com/images/M/MV5BOWUwNTZhZTktNGUxMi00NzA3LTlmYWQtYzg4YzZjMmNkNWQ2XkEyXkFqcGdeQXVyNTg0NTI4Nzg@._V1_SX300.jpg");
		p[9] = new Pelicula ("tt1922373", "Thor & Loki: Blood Brothers", "2011–", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTkxMTg1ODQ1MF5BMl5BanBnXkFtZTgwMDQ2ODcwMzE@._V1_SX300.jpg");
		
		BusquedaPelicula pFinal = new BusquedaPelicula(p, 53, "True");
		assertEquals(pFinal.getSearch()[0], p[0]);
		assertEquals(pFinal.getSearch()[1], p[1]);
		assertEquals(pFinal.getSearch()[2], p[2]);
		assertEquals(pFinal.getSearch()[3], p[3]);
		assertEquals(pFinal.getSearch()[4], p[4]);
		assertEquals(pFinal.getSearch()[5], p[5]);
		assertEquals(pFinal.getSearch()[6], p[6]);
		assertEquals(pFinal.getSearch()[7], p[7]);
		assertEquals(pFinal.getSearch()[8], p[8]);
		assertEquals(pFinal.getSearch()[9], p[9]);
		assertEquals(pFinal.getResponse(), "True");
		assertEquals(pFinal.getTotalResults(), 53);
		imprimir("Se verifica que se crea un producto completo");
	}
	
	@Test
	public void testVacio() {
		BusquedaPelicula p = new BusquedaPelicula();
		assertEquals(p.getSearch(), null);
		assertEquals(p.getResponse(), null);
		assertEquals(p.getTotalResults(), 0);
		imprimir("Se verifica que se crea un producto");
	}

	@Test
	public void testSetSearch() {
		Pelicula[] p = new Pelicula[10];

		p[0] = new Pelicula ("tt0800369", "Thor", "2011", "https://images-na.ssl-images-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg");
		p[1] = new Pelicula ("tt1981115", "Thor: The Dark World", "2013", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTQyNzAwOTUxOF5BMl5BanBnXkFtZTcwMTE0OTc5OQ@@._V1_SX300.jpg");
		p[2] = new Pelicula ("tt3501632", "Thor: Ragnarok", "2017", "https://images-na.ssl-images-amazon.com/images/M/MV5BMjMyNDkzMzI1OF5BMl5BanBnXkFtZTgwODcxODg5MjI@._V1_SX300.jpg");
		p[3] = new Pelicula ("tt6016776", "Team Thor", "2016", "https://images-na.ssl-images-amazon.com/images/M/MV5BMmY4NzA2OGUtYTc0MS00OTc0LThhYjAtZTJkMTI2MTgyNDY0XkEyXkFqcGdeQXVyNDQ5MDYzMTk@._V1_SX300.jpg");
		p[4] = new Pelicula ("tt1667903", "Thor: Tales of Asgard", "2011", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTcxOTU4NzIxMV5BMl5BanBnXkFtZTcwNzE3NjAxNQ@@._V1_SX300.jpg");
		p[5] = new Pelicula ("tt1792794", "Almighty Thor", "2011", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTcwNjI5MTAzNF5BMl5BanBnXkFtZTcwNTcyOTIwNQ@@._V1_SX300.jpg");
		p[6] = new Pelicula ("tt6599818", "Team Thor: Part 2", "2017", "https://images-na.ssl-images-amazon.com/images/M/MV5BOTJkYmFkM2ItOGIwMS00YWRhLTg5ZGQtNDA0ZjcwNzA3ZjQxXkEyXkFqcGdeQXVyNDQ5MDYzMTk@._V1_SX300.jpg");
		p[7] = new Pelicula ("tt1260572", "Thor: Hammer of the Gods", "2009", "https://images-na.ssl-images-amazon.com/images/M/MV5BNTFkMDA5ODEtMTQ1NC00NGRhLWE3ZGQtOGE5ZGJkMGI1ZDI5XkEyXkFqcGdeQXVyMjI1NjEzNjg@._V1_SX300.jpg");
		p[8] = new Pelicula ("tt1241721", "Thor: Legend of the Magical Hammer", "2011", "https://images-na.ssl-images-amazon.com/images/M/MV5BOWUwNTZhZTktNGUxMi00NzA3LTlmYWQtYzg4YzZjMmNkNWQ2XkEyXkFqcGdeQXVyNTg0NTI4Nzg@._V1_SX300.jpg");
		p[9] = new Pelicula ("tt1922373", "Thor & Loki: Blood Brothers", "2011–", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTkxMTg1ODQ1MF5BMl5BanBnXkFtZTgwMDQ2ODcwMzE@._V1_SX300.jpg");
		
		BusquedaPelicula pFinal = new BusquedaPelicula();
		pFinal.setSearch(p);
		
		assertEquals(pFinal.getSearch()[0], p[0]);
		assertEquals(pFinal.getSearch()[1], p[1]);
		assertEquals(pFinal.getSearch()[2], p[2]);
		assertEquals(pFinal.getSearch()[3], p[3]);
		assertEquals(pFinal.getSearch()[4], p[4]);
		assertEquals(pFinal.getSearch()[5], p[5]);
		assertEquals(pFinal.getSearch()[6], p[6]);
		assertEquals(pFinal.getSearch()[7], p[7]);
		assertEquals(pFinal.getSearch()[8], p[8]);
		assertEquals(pFinal.getSearch()[9], p[9]);
		imprimir("Se verifica que se inserta el 'Search'");
	}
	
	@Test
	public void testSetTotalResults() {
		BusquedaPelicula p = new BusquedaPelicula();
		p.setResponse("True");
		assertEquals("True", p.getResponse());
		imprimir("Se verifica que se inserta el 'TotalResults'");
	}
	
	@Test
	public void testSetResponse() {
		BusquedaPelicula p = new BusquedaPelicula();
		p.setTotalResults(53);
		assertEquals(53, p.getTotalResults());
		imprimir("Se verifica que se inserta el 'Response'");
	}

	private static void imprimir(String text) {
		System.out.println(text);
	}
	
}
