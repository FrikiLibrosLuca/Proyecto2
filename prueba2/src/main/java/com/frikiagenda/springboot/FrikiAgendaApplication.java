package com.frikiagenda.springboot;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate4.HibernateTransactionManager;


@SpringBootApplication
@ComponentScan("com.frikiagenda.springboot")
public class FrikiAgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrikiAgendaApplication.class, args);
	}
	
	
	
	 @Autowired
	    private EntityManagerFactory entityManagerFactory;

	    @Bean
	    public SessionFactory getSessionFactory() {
	        if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
	            throw new NullPointerException("factory is not a hibernate factory");
	        }
	        return entityManagerFactory.unwrap(SessionFactory.class);
	    }
	    
	    
	    @Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(
				SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(
					sessionFactory);

			return transactionManager;
		}
}
