package com.example.springboot_hibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHibernateApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringbootHibernateApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateApplication.class, args);
	}

}
