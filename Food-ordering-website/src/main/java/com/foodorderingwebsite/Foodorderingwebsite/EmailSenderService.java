package com.foodorderingwebsite.Foodorderingwebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;
  public void sendSimpleEmail(String toEmail,String body,String subject){


      SimpleMailMessage message=new SimpleMailMessage();
      message.setTo(toEmail);
      message.setText(body);
      message.setSubject(subject);
      message.setFrom("charushah8990@gmail.com");

      mailSender.send(message);
      System.out.println("Mail send...!!!");
  }

}
