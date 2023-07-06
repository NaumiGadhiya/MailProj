package com.mail.services;

import com.mail.entities.EmpEntity;
import com.mail.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;
/*
     public void updatePassword(EmpEntity emp) {
          // Update the employee's password and set the passwordUpdateDate to the current date
//         emp.setPassword(newPassword);
         emp.setUpdatePassDate(LocalDate.now());
         empRepo.save(emp);
     }
*/



}
