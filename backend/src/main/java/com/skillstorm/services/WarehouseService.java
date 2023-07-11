package com.skillstorm.services;

import java.util.List;

import com.skillstorm.models.Warehouse;

public interface WarehouseService {
	public Warehouse findById(Long id);
	
	public Iterable<Warehouse> findAll();
	
	public Warehouse save(Warehouse warehouse);
	
	public void delete(Long warehouseId);

	public Warehouse create(Warehouse warehouse);
}
