package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.controllers.MasterController;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;

@SpringBootApplication
@EnableEmailTools
@ComponentScan(basePackageClasses = MasterController.class)
public class SpringBootFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFinderApplication.class, args);
	}
}
