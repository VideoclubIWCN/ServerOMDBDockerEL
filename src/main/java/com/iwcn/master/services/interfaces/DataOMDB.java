package com.iwcn.master.services.interfaces;

import java.util.List;

import com.iwcn.master.model.Pelicula;
import com.iwcn.master.model.PeliculaConcreta;

public interface DataOMDB {
	
	public List<Pelicula> callListaPeliculasOMDB (String optio);
	
	public PeliculaConcreta callPeliculaConcretaOMDB (String optio);
	
}
