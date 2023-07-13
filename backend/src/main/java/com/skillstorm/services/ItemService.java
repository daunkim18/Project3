package com.skillstorm.services;

import java.util.List;

import com.skillstorm.models.Item;
import com.skillstorm.models.Warehouse;

public interface ItemService {
	public Item findById(Long id);
	
	public Iterable<Item> findAll();
	
	public Item save(Item item);
	
	public void delete(Long id);
	
	public Iterable<Item> findItemsByWarehouse(Warehouse warehouse);
	
	public Item create(Item item);
	
	public Iterable<Item> findByCandyTypeDescription(String type);
	
	public Iterable<Item> findByWarehouseAndCandyTypeDescriptionIn(Warehouse warehouse, List<String> type);
}
