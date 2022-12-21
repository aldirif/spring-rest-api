package com.example.springrestapi.service;

import com.example.springrestapi.model.SupplierModel;

import java.util.List;
import java.util.Optional;

public interface SupplierService {
    List<SupplierModel> getAll();
    Optional<SupplierModel> getById(Long id);
    Optional<SupplierModel> save(SupplierModel model);
    Optional<SupplierModel> update(Long id, SupplierModel model);
    Optional<SupplierModel> delete(Long id);
}
