package com.example.springrestapi.model;

import com.example.springrestapi.entity.PurchaseOrderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderModel {
    private Integer id;
    private String poCode;
    private Integer customerId;
    private Integer employeeId;
    private Integer shipperId;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date poDate;
    private Double totalAmount;

    public PurchaseOrderModel(PurchaseOrderEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
