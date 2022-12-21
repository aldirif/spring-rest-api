package com.example.springrestapi.repository;

import com.example.springrestapi.entity.ShipperEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipperRepo extends JpaRepository<ShipperEntity, Long> {
}
