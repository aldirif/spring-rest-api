package com.example.springrestapi.service;


import com.example.springrestapi.model.CustomerModel;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<CustomerModel> getAll();
    Optional<CustomerModel> getById(Integer id);
    Optional<CustomerModel> save(CustomerModel model);
    Optional<CustomerModel> update(Integer id, CustomerModel model);
    Optional<CustomerModel> delete(Integer id);
}
