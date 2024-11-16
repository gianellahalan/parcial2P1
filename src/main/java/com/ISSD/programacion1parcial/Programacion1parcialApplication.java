package com.ISSD.programacion1parcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class Programacion1parcialApplication {

	public static void main(String[] args) {
		SpringApplication.run(Programacion1parcialApplication.class, args);
	}

}
