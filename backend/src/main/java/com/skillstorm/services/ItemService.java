package com.skillstorm.services;

import java.util.List;

import com.skillstorm.dtos.ItemDto;
import com.skillstorm.models.Item;

public interface ItemService {
	public Item findById(long id);
	
	public Iterable<Item> findAll();
	
	public Item save(ItemDto item);
	
	public void delete(long id);
	
	public Iterable<Item> findItemsByWarehouse(long id);
	
	public Item create(ItemDto item);
	
	public Iterable<Item> findByCandyTypeDescription(String type);
	
	public Iterable<Item> findByWarehouse_WarehouseIdAndCandyTypeDescriptionIn(long id, List<String> type);
	
	public int findInventoryCountFromWarehouseId(long id);
}
