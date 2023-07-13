package com.skillstorm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Item;
import com.skillstorm.models.Warehouse;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
	
	@Query("select * from Item i where i.warehouseId = ?1")
	public Iterable<Item> findItemsByWarehouse(Warehouse warehouse);
	
	public Iterable<Item> findByCandyType_Description(String type);
	
	public Iterable<Item> findByWarehouseAndCandyType_DescriptionIn(Warehouse warehouse, List<String> type);
}
