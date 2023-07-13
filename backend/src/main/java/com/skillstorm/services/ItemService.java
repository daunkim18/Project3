package com.skillstorm.services;

import java.util.List;

import com.skillstorm.models.Item;
import com.skillstorm.models.Warehouse;

public interface ItemService {
	public Item findById(long id);
	
	public Iterable<Item> findAll();
	
	public Item save(Item item);
	
	public void delete(long id);
	
	public Iterable<Item> findItemsByWarehouse(long id);
	
	public Item create(Item item);
	
	public Iterable<Item> findByCandyTypeDescription(String type);
	
	public Iterable<Item> findByWarehouse_WarehouseIdAndCandyTypeDescriptionIn(long id, List<String> type);
	
	public int findInventoryCountFromWarehouseId(long id);
}
