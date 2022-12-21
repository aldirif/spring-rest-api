package com.example.springrestapi.service.impl;

import com.example.springrestapi.entity.PurchaseOrderEntity;
import com.example.springrestapi.model.PurchaseOrderModel;
import com.example.springrestapi.repository.PurchaseOderRepo;
import com.example.springrestapi.repository.PurchaseOrderDetailRepo;
import com.example.springrestapi.service.PurchaseOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    private PurchaseOderRepo oderRepo;
    private PurchaseOrderDetailRepo detailRepo;

    @Autowired
    public PurchaseOrderServiceImpl(PurchaseOderRepo oderRepo, PurchaseOrderDetailRepo detailRepo) {
        this.oderRepo = oderRepo;
        this.detailRepo = detailRepo;
    }

    @Override
    public Optional<PurchaseOrderModel> save(PurchaseOrderModel model) {
        if(model == null || model.getDetails().isEmpty()) {
            return Optional.empty();
        }

        PurchaseOrderEntity entity = new PurchaseOrderEntity(model);
        entity.addDetailList(model.getDetails());

        try{
            oderRepo.save(entity);
            return Optional.of(model);
        }catch (Exception e){
            log.error("Purchase Order save is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }
}


