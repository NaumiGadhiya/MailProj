package com.mail.services;

import com.mail.entities.EmpEntity;
import com.mail.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class MailSendingService {

    @Autowired
    private JavaMailSender javaMailSender;


    public void sendEmail(EmpEntity emp){
        String to=emp.getEmail();
        String subject="Sample mail message confirmation";
        String body="Hello User, As per our terms and condition here we are requesting you to please reset your password within this month.";

        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom("naumixyz@gmail.com");
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(body);

        javaMailSender.send(mailMessage);

        System.out.println("mail sent successfully...");
    }

    /*

//    --------------send email every 25 days after last password update date--------------
    public void sendResetPasswordReminderEmail(EmpEntity emp) {

            String to=emp.getEmail();
            String subject="Sample mail message confirmation";
            String body="Hello User, As per our terms and condition here we are requesting you to please reset your password within this month.";

            SimpleMailMessage mailMessage=new SimpleMailMessage();
            mailMessage.setFrom("naumixyz@gmail.com");
            mailMessage.setTo(to);
            mailMessage.setSubject(subject);
            mailMessage.setText(body);

            javaMailSender.send(mailMessage);

            System.out.println("mail sent successfully...");

    }
    */


}
