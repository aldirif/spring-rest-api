package com.example.springrestapi.service;

import com.example.springrestapi.model.ShipperModel;

import java.util.List;
import java.util.Optional;

public interface ShipperService {
    List<ShipperModel> getAll();
    Optional<ShipperModel> getById(Long id);
    Optional<ShipperModel> save(ShipperModel model);
    Optional<ShipperModel> update(Long id, ShipperModel model);
    Optional<ShipperModel> delete(Long id);
}
