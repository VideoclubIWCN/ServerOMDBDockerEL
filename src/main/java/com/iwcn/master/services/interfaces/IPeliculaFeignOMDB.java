package com.iwcn.master.services.interfaces;

import com.iwcn.master.model.BusquedaPelicula;
import com.iwcn.master.model.PeliculaConcreta;

import feign.RequestLine;

public interface IPeliculaFeignOMDB {
	
	@RequestLine("GET")
	BusquedaPelicula getListaPeliculasOMDB();
	
	@RequestLine("GET")
	PeliculaConcreta getPeliculaOMDB();
	
}
