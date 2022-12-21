package com.example.springrestapi.repository;

import com.example.springrestapi.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {
}

