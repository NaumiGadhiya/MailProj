package com.mail.repository;

import com.mail.entities.EmpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<EmpEntity,Integer> {
}
