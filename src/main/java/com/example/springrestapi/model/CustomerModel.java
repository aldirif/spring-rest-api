package com.example.springrestapi.model;

import com.example.springrestapi.entity.CustomerEntity;
import com.example.springrestapi.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {
    private Long id;
    private String fullName;
    private String address;
    private String city;
    private String gender;
    private Date dateOfBirth;
    private String dateOfPlace;

    public CustomerModel(CustomerEntity entity){
        BeanUtils.copyProperties(entity, this);
    }
}
