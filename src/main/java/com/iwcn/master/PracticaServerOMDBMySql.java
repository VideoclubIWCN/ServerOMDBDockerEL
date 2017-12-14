package com.iwcn.master;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class PracticaServerOMDBMySql extends WebMvcConfigurerAdapter{

    public static void main(String[] args) {
        SpringApplication.run(PracticaServerOMDBMySql.class, args);
    }

}
