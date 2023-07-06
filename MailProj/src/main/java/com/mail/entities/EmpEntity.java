package com.mail.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee_data")
public class EmpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "emp_id")
    private Integer id;

    @Column(name = "emp_name")
    private String name;

    @Column(name = "emp_email")
    private String email;

//    @Transient
//    private String password;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "emp_dob")
    private LocalDate dob;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    @Column(name = "emp_updatePassDate")
    private LocalDate updatePassDate;

    @Column(name = "emp_addr")
    private String addr;


}
