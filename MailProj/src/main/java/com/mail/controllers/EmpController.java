package com.mail.controllers;

import com.mail.entities.EmpEntity;
import com.mail.repository.EmpRepo;
import com.mail.services.EmpService;
import com.mail.services.MailSendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpRepo empRepo;

    @Autowired
    private MailSendingService mailSendingService;


    @Scheduled(cron = "0 0 2 * * MONL")
    public void sendEmailOnLastMondayOfEveryMonth() {

        List<EmpEntity> employees = empRepo.findAll();
        for (EmpEntity emp : employees) {
                mailSendingService.sendEmail(emp);
        }
    }



    /*

//    --------------send email every 25 days after last password update date--------------

    @Scheduled(cron = "* * 12 * ? ?")
    public void sendPasswordResetReminder() {
        LocalDate currentDate = LocalDate.now();

        List<EmpEntity> employees = empRepo.findAll();

        for (EmpEntity emp : employees) {
            LocalDate lastPasswordUpdate = emp.getUpdatePassDate();
            if (lastPasswordUpdate != null && lastPasswordUpdate.plusDays(25).isBefore(currentDate)) {
                mailSendingService.sendEmail(emp);
            }
        }
        */
//    }

}
