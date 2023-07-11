package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{
	
	@Query("select * from Item i where i.warehouseId = ?1")
	public Iterable<Item> findItemsByWarehouseId(Long id);
}
