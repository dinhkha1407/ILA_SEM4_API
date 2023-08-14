package com.example.ila.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = { "com.example.ila.api.restcontroller"})
public class IlaSem4ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IlaSem4ApiApplication.class, args);
	}

}
