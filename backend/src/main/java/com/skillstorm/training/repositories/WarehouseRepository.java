package com.skillstorm.training.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Warehouse;

@Repository
public interface WarehouseRepository extends CrudRepository<Warehouse, Long>{

}
