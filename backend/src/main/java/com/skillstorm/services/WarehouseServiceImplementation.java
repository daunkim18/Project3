package com.skillstorm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Warehouse;
import com.skillstorm.repositories.WarehouseRepository;

@Service
public class WarehouseServiceImplementation implements WarehouseService {

	@Autowired
	private WarehouseRepository repo;
	
	@Override
	public Warehouse findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Iterable<Warehouse> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Warehouse save(Warehouse warehouse) {
		// TODO Auto-generated method stub
		return repo.save(warehouse);
	}

	@Override
	public void delete(Long warehouseId) {
		repo.deleteById(warehouseId);
		
	}

	@Override
	public Warehouse create(Warehouse warehouse) {
		// TODO Auto-generated method stub
		return repo.save(warehouse);
	}

}
