package com.anz.engineering.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.anz.controller.AccountController;
import com.anz.service.AccountService;

@SpringBootApplication
@EnableJpaRepositories("com.anz.repository")
@EntityScan("com.anz.model")
@ComponentScan(basePackageClasses= {AccountController.class,AccountService.class})
public class AnzWholesaleEngineeringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnzWholesaleEngineeringApplication.class, args);
	}

}
