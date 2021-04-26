package com.king.ferrariapi.repository;

import com.king.ferrariapi.models.Model;
import org.springframework.data.repository.CrudRepository;

public interface ModelRepository extends CrudRepository<Model, Long> {
}
