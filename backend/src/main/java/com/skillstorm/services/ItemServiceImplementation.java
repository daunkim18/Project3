package com.skillstorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Item;
import com.skillstorm.models.Warehouse;
import com.skillstorm.repositories.ItemRepository;

@Service
public class ItemServiceImplementation implements ItemService{
	
	@Autowired
	private ItemRepository repo;
	
	@Override
	public Item findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Iterable<Item> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Item save(Item item) {
		// TODO Auto-generated method stub
		return repo.save(item);
	}


	@Override
	public Iterable<Item> findItemsByWarehouse(Warehouse warehouse) {
		
		return repo.findItemsByWarehouse(warehouse);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Item create(Item item) {
		// TODO Auto-generated method stub
		return repo.save(item);
	}

	@Override
	public Iterable<Item> findByCandyTypeDescription(String type) {
		// TODO Auto-generated method stub
		return repo.findByCandyType_Description(type);
	}

	@Override
	public Iterable<Item> findByWarehouseAndCandyTypeDescriptionIn(Warehouse warehouse, List<String> type) {
		// TODO Auto-generated method stub
		return repo.findByWarehouseAndCandyType_DescriptionIn(warehouse, type);
	}

}
