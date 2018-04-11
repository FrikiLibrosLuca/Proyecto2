package com.frikiagenda.springboot;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.frikiagenda.springboot")
public class FrikiAgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrikiAgendaApplication.class, args);
	}

	@Bean
	public SessionFactory getSessionFactory(EntityManagerFactory entityManagerFactory) {
		if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
			throw new NullPointerException("factory is not a hibernate factory");
		}
		return entityManagerFactory.unwrap(SessionFactory.class);
	}

}
