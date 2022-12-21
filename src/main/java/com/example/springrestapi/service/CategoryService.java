package com.example.springrestapi.service;

import com.example.springrestapi.model.CategoryModel;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryModel> getAll();
    Optional<CategoryModel> getById(Long id);
    Optional<CategoryModel> save(CategoryModel model);
    Optional<CategoryModel> update(Long id, CategoryModel model);
    Optional<CategoryModel> delete(Long id);
}


