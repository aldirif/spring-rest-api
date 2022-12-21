package com.example.springrestapi.service;

import com.example.springrestapi.model.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductService {
   List<ProductModel> getAll();
   Optional<ProductModel> getById(Long id);
   Optional<ProductModel> save(ProductModel model);
   Optional<ProductModel> update(Long id, ProductModel model);
   Optional<ProductModel> delete(Long id);
}

