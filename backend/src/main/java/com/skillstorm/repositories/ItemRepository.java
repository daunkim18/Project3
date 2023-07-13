package com.skillstorm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Item;
import com.skillstorm.models.Warehouse;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
	
	@Query(value = "select i from Item i where i.warehouse.warehouseId = ?1")
	public Iterable<Item> findItemsByWarehouse(long id);
	
	@Query(value = "SELECT COUNT(*) FROM Item i where i.warehouse.warehouseId = ?1")
	public int findInventoryCountFromWarehouseId(long id);
	
	public Iterable<Item> findByCandyType_Description(String type);
	
	public Iterable<Item> findByWarehouse_WarehouseIdAndCandyType_DescriptionIn(long warehouseId, List<String> type);
}
