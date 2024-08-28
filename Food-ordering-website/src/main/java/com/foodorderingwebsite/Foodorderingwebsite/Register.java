package com.foodorderingwebsite.Foodorderingwebsite;

import com.foodorderingwebsite.Foodorderingwebsite.password.Utilss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Register {

    @Autowired
    private EmailSenderService service;


    @EventListener(ApplicationReadyEvent.class)
    public void triggerMail() {
        service.sendSimpleEmail("shahshubham38@gmail.com", Utilss.PasswordGenerator(),
                "Congratulations your Registration is successful !!");
    }
}