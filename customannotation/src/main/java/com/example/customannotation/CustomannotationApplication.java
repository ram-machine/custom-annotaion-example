package com.example.customannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.dynamicdatasource.demo","com.example.customannotation"})
public class CustomannotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomannotationApplication.class, args);
	}

}
