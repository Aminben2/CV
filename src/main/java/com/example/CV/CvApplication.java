package com.example.CV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = ThymeleafAutoConfiguration.class)
//@ComponentScan("com.example.CV.config")
public class CvApplication {
	public static void main(String[] args) {
		SpringApplication.run(CvApplication.class, args);

	}
}
