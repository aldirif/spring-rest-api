package com.example.springrestapi.model;

import com.example.springrestapi.entity.ProductEntity;
import com.example.springrestapi.entity.PurchaseOrderDetailEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderDetailModel implements Serializable {
    private Long id;
    private Long poId;
    private Long productId;
    private Double quantity;
    private Double price;
}
