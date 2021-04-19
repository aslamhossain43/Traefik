package com.traefik.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.traefik.main.controllers"})
public class Service3Application {

	public static void main(String[] args) {
		SpringApplication.run(Service3Application.class, args);
	}

}
