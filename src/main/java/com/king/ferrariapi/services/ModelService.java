package com.king.ferrariapi.services;

import com.king.ferrariapi.models.Model;

import java.util.List;

public interface ModelService {
    Model save(Model model);

    List<Model> findAll();
}
