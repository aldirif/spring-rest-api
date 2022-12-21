package com.example.springrestapi.repository;

import com.example.springrestapi.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<SupplierEntity, Long> {
}
