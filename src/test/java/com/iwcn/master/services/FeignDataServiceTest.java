package com.iwcn.master.services;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.iwcn.master.services.DatabaseServicesOMDB;
import com.iwcn.master.services.interfaces.IPeliculaFeignOMDB;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;

@RunWith(SpringRunner.class)
public class FeignDataServiceTest {

	private DatabaseServicesOMDB fClient = new DatabaseServicesOMDB();
	
	@Test
	public void testCallListaPeliculas() {
		IPeliculaFeignOMDB pelis = Feign.builder()
				  .client(new OkHttpClient())
				  .encoder(new JacksonEncoder())
				  .decoder(new JacksonDecoder())
				  .target(IPeliculaFeignOMDB.class, "http://www.omdbapi.com/?s=Thor&apikey=eade2643");
			
		assertEquals(pelis.getListaPeliculasOMDB().getTotalResults(), 53);
		
		imprimir("Se verifica que se llama a 'getListaPeliculasOMDB'");
	}
	
	@Test
	public void testCallPeliculaConcreta() {
		IPeliculaFeignOMDB peli = Feign.builder()
				  .client(new OkHttpClient())
				  .encoder(new JacksonEncoder())
				  .decoder(new JacksonDecoder())
				  .target(IPeliculaFeignOMDB.class, "http://www.omdbapi.com/?i=tt0800369&apikey=eade2643");		
		
		assertEquals(peli.getPeliculaOMDB().getImdbID(), "tt0800369");
		
		imprimir("Se verifica que se llama a 'getPeliculaOMDB'");
	}

	private static void imprimir(String text) {
		System.out.println(text);
	}

}
