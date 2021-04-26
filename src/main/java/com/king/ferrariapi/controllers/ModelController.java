package com.king.ferrariapi.controllers;

import com.king.ferrariapi.models.Model;
import com.king.ferrariapi.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class ModelController {
    @Autowired
    ModelService modelService;

    @GetMapping(value = "/models", produces = "application/json")
    public ResponseEntity<?> getAllModels() {
        List<Model> allModels = modelService.findAll();
        return new ResponseEntity<>(allModels, HttpStatus.OK);
    }
}
