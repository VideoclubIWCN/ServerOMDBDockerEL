package com.iwcn.master.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iwcn.master.model.Pelicula;
import com.iwcn.master.model.PeliculaConcreta;
import com.iwcn.master.services.DatabaseServicesOMDB;

@RestController
public class AppRestControllerOMDB {
	
	@Autowired
	private DatabaseServicesOMDB dbServices;
	
    
    @RequestMapping(value = "/peliculas/{optio}", method = RequestMethod.GET)
    public List<Pelicula> getPeliculasOMDB(@PathVariable String optio) {
    	return dbServices.callListaPeliculasOMDB(optio);
    }
    
    @RequestMapping(value = "/pelicula/{optio}", method = RequestMethod.GET)
    public PeliculaConcreta getPeliculaOMDB(@PathVariable String optio) {
    	return dbServices.callPeliculaConcretaOMDB(optio);
    }

    
}