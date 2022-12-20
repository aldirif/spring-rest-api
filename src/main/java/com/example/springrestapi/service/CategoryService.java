package com.example.springrestapi.service;

import com.example.springrestapi.model.CategoryModel;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryModel> getAll();
    Optional<CategoryModel> getById(Integer id);
    Optional<CategoryModel> save(CategoryModel model);
    Optional<CategoryModel> update(Integer id, CategoryModel model);
    Optional<CategoryModel> delete(Integer id);
}
