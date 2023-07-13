package com.skillstorm.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.dtos.ItemDto;
import com.skillstorm.models.CandyType;
import com.skillstorm.models.Item;
import com.skillstorm.models.Warehouse;
import com.skillstorm.repositories.CandyTypeRepository;
import com.skillstorm.repositories.ItemRepository;
import com.skillstorm.repositories.WarehouseRepository;

@Service
public class ItemServiceImplementation implements ItemService{
	
	@Autowired
	private ItemRepository repo;
	
	@Autowired
	private CandyTypeRepository typeRepo;
	
	@Autowired
	private WarehouseRepository warehouseRepo;
	
	@Override
	public Item findById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Iterable<Item> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Item save(ItemDto item) {
		Warehouse warehouse = warehouseRepo.findById(item.getWarehouseId()).get();  //orElse throw
		CandyType candyType = typeRepo.findById(item.getTypeId()).get();
		Item createdItem = new Item(item.getId(), item.getName(), warehouse, candyType, item.getQuantity(), item.getPopularity() );
		return repo.save(createdItem);
	}


	@Override
	public Iterable<Item> findItemsByWarehouse(long id) {
		
		return repo.findItemsByWarehouse(id);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
		
	}

	@Override
	@Transactional
	public Item create(ItemDto item) {
		Warehouse warehouse = warehouseRepo.findById(item.getWarehouseId()).get();  //orElse throw
		CandyType candyType = typeRepo.findById(item.getTypeId()).get();
		Item createdItem = new Item(item.getId(), item.getName(), warehouse, candyType, item.getQuantity(), item.getPopularity() );
		return repo.save(createdItem);
	}

	@Override
	public Iterable<Item> findByCandyTypeDescription(String type) {
		// TODO Auto-generated method stub
		return repo.findByCandyType_Description(type);
	}

	@Override
	public Iterable<Item> findByWarehouse_WarehouseIdAndCandyTypeDescriptionIn(long id, List<String> type) {
		// TODO Auto-generated method stub
		return repo.findByWarehouse_WarehouseIdAndCandyType_DescriptionIn(id, type);
	}

	@Override
	public int findInventoryCountFromWarehouseId(long id) {
		// TODO Auto-generated method stub
		return repo.findInventoryCountFromWarehouseId(id);
	}

}
