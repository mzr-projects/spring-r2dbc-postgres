package com.mt.r2dbc.demo.springr2dbcpostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class SpringR2dbcPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringR2dbcPostgresApplication.class, args);
	}
}
