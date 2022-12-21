package com.example.springrestapi.repository;

import com.example.springrestapi.entity.PurchaseOrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderDetailRepo extends JpaRepository<PurchaseOrderDetailEntity, Long> {
}
