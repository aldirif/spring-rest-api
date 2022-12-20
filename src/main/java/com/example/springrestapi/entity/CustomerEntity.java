package com.example.springrestapi.entity;

import com.example.springrestapi.model.CategoryModel;
import com.example.springrestapi.model.CustomerModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer_tab")
public class CustomerEntity {
    @Id
    @TableGenerator(name = "id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="customer_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "id_generator")
    private Long id;

    @Column(name = "fullName", length = 120)
    private String fullName;

    @Column(name = "address", length = 120)
    private String address;

    @Column(name = "city", length = 120)
    private String city;

    @Column(name = "gender", length = 120)
    private String gender;

    @Column(name = "dateOfBirth", length = 120)
    private Date dateOfBirth;

    @Column(name = "dateOfPlace", length = 120)
    private String dateOfPlace;

    public CustomerEntity(CustomerModel model) {
        BeanUtils.copyProperties(model, this);
    }
}

