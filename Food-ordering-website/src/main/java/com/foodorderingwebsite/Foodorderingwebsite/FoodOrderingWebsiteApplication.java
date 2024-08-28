package com.foodorderingwebsite.Foodorderingwebsite;

import com.foodorderingwebsite.Foodorderingwebsite.password.Utilss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class 	FoodOrderingWebsiteApplication {

/*	@Autowired
	private EmailSenderService service;*/

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderingWebsiteApplication.class, args);

	}

/*	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		service.sendSimpleEmail("shahshubham38@gmail.com", Utilss.PasswordGenerator(),
				"Congratulations your Restaurant is successfully registered!!");*/

	}



