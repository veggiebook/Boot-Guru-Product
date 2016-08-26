package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.domain.Customer;
import com.example.repositories.CustomerRepository;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		ApplicationContext cxt =  SpringApplication.run(DemoApplication.class, args);
		//can get beans from this context, such as 
		HelloBean hellobean = cxt.getBean(HelloBean.class);
		System.out.println(hellobean.sayHello());
	}
	

	@Bean
	public CommandLineRunner loaddata(CustomerRepository repository) {
		return (args) -> {
			System.out.println("--------------------------------------------------");
			// save a couple of customers
//			repository.save(new Customer("Jack", "Bauer"));
//			repository.save(new Customer("Chloe", "O'Brian"));
//			repository.save(new Customer("Kim", "Bauer"));
//			repository.save(new Customer("David", "Palmer"));
//			repository.save(new Customer("Michelle", "Dessler"));
//			repository.save(new Customer("Nancy", "Lee"));
//			repository.save(new Customer("Nancy", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
//			Customer customer = repository.findOne(40L);
//			log.info("Customer found with findOne(26L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("--------------------------------");
//			log.info("Change his first name to PTC");
//			customer.setFirstName("PTC");
//			repository.save(customer);
//			log.info("");
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			for (Customer bauer : repository.findByLastName("Bauer")) {
//				log.info(bauer.toString());
//			}
//			log.info("");

			// fetch customers by first name
//			log.info("Customer found with findByFirstName('Nancy'):");
//			log.info("--------------------------------------------");
//			for (Customer bauer : repository.findByFirstName("Nancy")) {
//				log.info(bauer.toString());
//			}
//			log.info("");
			
			//repository.deleteAll();
		};
	}
}
