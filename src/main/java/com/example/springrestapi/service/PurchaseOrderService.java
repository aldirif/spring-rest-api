package com.example.springrestapi.service;

import com.example.springrestapi.model.PurchaseOrderModel;

import java.util.Optional;

public interface PurchaseOrderService {
    Optional<PurchaseOrderModel> save(PurchaseOrderModel model);
}
