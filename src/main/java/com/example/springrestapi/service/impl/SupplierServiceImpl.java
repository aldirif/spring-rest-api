package com.example.springrestapi.service.impl;

import com.example.springrestapi.entity.SupplierEntity;
import com.example.springrestapi.model.SupplierModel;
import com.example.springrestapi.repository.SupplierRepo;
import com.example.springrestapi.service.SupplierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class SupplierServiceImpl implements SupplierService {
    private SupplierRepo repo;

    @Autowired
    public SupplierServiceImpl(SupplierRepo repo){
        this.repo = repo;
    }

    @Override
    public List<SupplierModel> getAll() {
        return this.repo.findAll().stream().map(SupplierModel::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<SupplierModel> getById(Long id) {
        if(id == 0) {
            return Optional.empty();
        }
        Optional<SupplierEntity> result = this.repo.findById(id);
        return result.map(SupplierModel::new);
    }

    @Override
    public Optional<SupplierModel> save(SupplierModel model) {
        if(model == null) {
            return Optional.empty();
        }
        SupplierEntity entity = new SupplierEntity(model);
        try {
            this.repo.save(entity);
            return Optional.of(new SupplierModel(entity));
        }catch (Exception e){
            log.error("Save is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<SupplierModel> update(Long id, SupplierModel model) {
        if(id == 0) {
            return Optional.empty();
        }

        SupplierEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        // copy property
        BeanUtils.copyProperties(model, result);
        try {
            this.repo.save(result);
            return Optional.of(new SupplierModel(result));
        }catch (Exception e){
            log.error("Update is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<SupplierModel> delete(Long id) {
        if(id == 0) {
            return Optional.empty();
        }

        SupplierEntity result = this.repo.findById(id).orElse(null);
        if(result == null){
            return Optional.empty();
        }

        try {
            this.repo.delete(result);
            return Optional.of(new SupplierModel(result));
        }catch (Exception e){
            log.error("Delete is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }
}
