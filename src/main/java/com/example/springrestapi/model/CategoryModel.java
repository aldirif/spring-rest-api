package com.example.springrestapi.model;

import com.example.springrestapi.entity.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel {
    private Long id;
    private String code;
    private String name;

    public CategoryModel(CategoryEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
