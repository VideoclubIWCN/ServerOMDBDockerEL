package com.iwcn.master.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import com.iwcn.master.controllers.AppRestControllerOMDB;
import com.iwcn.master.model.Pelicula;
import com.iwcn.master.model.PeliculaConcreta;

@RunWith(SpringRunner.class)
public class AppRestControllerOMDBTest {
	
	private ArrayList<Pelicula> todasPeliculas = new ArrayList<Pelicula> ();
	
	@Mock
	private DatabaseServicesOMDB dbServices;
	
	@InjectMocks
	private AppRestControllerOMDB appRest = new AppRestControllerOMDB();
	
	public void AppRestController () {
		
	}
	
	@Before
	public void init(){
		Pelicula p = new Pelicula("tt0800369", "Thor", "2011", "https://images-na.ssl-images-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg");
		todasPeliculas.add(p);
		
		PeliculaConcreta pC = new PeliculaConcreta(1, "tt0800369", "Thor", 
				"The powerful, but arrogant god Thor, is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders.", 
				"06 May 2011", "Kenneth Branagh", "Chris Hemsworth, Natalie Portman, Tom Hiddleston, Anthony Hopkins",
				"https://images-na.ssl-images-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg", "7.0", 
				"115 min", "https://www.youtube.com/watch?v=Uvjcm93izdg");
		
		
		when(dbServices.callListaPeliculasOMDB("Thor")).thenReturn(todasPeliculas);
		when(dbServices.callPeliculaConcretaOMDB("tt0800369")).thenReturn(pC);
		
	}
	
	@Test
	public void testGetPeliculasOMDB() {
		assertEquals(appRest.getPeliculasOMDB("Thor").size(), 1);
		verify(dbServices).callListaPeliculasOMDB("Thor");
		imprimir("Se verifica que se llama una vez al método 'callListaPeliculasOMDB'");
	}
	
	@Test
	public void testGetPeliculaOMDB() {
		PeliculaConcreta p = appRest.getPeliculaOMDB("tt0800369");
		assertEquals(p.getId(), 1);
		assertEquals(p.getImdbID(), "tt0800369");
		assertEquals(p.getTitle(), "Thor");
		assertEquals(p.getPlot(), "The powerful, but arrogant god Thor, is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders.");
		assertEquals(p.getReleased(), "06 May 2011");
		assertEquals(p.getDirector(), "Kenneth Branagh");
		assertEquals(p.getActors(), "Chris Hemsworth, Natalie Portman, Tom Hiddleston, Anthony Hopkins");
		assertEquals(p.getPoster(), "https://images-na.ssl-images-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg");
		assertEquals(p.getImdbRating(), "7.0");
		assertEquals(p.getRuntime(), "115 min");
		assertEquals(p.getVideo(), "https://www.youtube.com/watch?v=Uvjcm93izdg");
		
		verify(dbServices).callPeliculaConcretaOMDB("tt0800369");
		imprimir("Se verifica que se llama una vez al método 'callPeliculaConcretaOMDB'");
	}	
	
	private static void imprimir(String text) {
		System.out.println(text);
	}
	
}