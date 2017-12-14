package com.iwcn.master.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.iwcn.master.model.PeliculaConcreta;
import com.iwcn.master.services.interfaces.DataOMDB;
import com.iwcn.master.services.interfaces.IPeliculaFeignOMDB;
import com.iwcn.master.model.Pelicula;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;

@Service
public class DatabaseServicesOMDB implements DataOMDB{
	
	public List<Pelicula> callListaPeliculasOMDB (String optio) {
		if (optio.length() > 0) {
			IPeliculaFeignOMDB pelis = Feign.builder()
					  .client(new OkHttpClient())
					  .encoder(new JacksonEncoder())
					  .decoder(new JacksonDecoder())
					  .target(IPeliculaFeignOMDB.class, "http://www.omdbapi.com/?s=" + optio + "&apikey=eade2643");
			return Arrays.asList(pelis.getListaPeliculasOMDB().getSearch());
		}
		
		return null;
	}
	
	@Override
	public PeliculaConcreta callPeliculaConcretaOMDB (String optio) {
		IPeliculaFeignOMDB peli = Feign.builder()
				  .client(new OkHttpClient())
				  .encoder(new JacksonEncoder())
				  .decoder(new JacksonDecoder())
				  .target(IPeliculaFeignOMDB.class, "http://www.omdbapi.com/?i=" + optio + "&apikey=eade2643");
		
		return peli.getPeliculaOMDB();
	}
	
}