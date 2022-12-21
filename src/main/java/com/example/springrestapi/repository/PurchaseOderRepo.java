package com.example.springrestapi.repository;

import com.example.springrestapi.entity.PurchaseOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOderRepo extends JpaRepository<PurchaseOrderEntity, Long> {
}

