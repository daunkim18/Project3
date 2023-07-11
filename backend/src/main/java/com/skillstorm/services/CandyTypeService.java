package com.skillstorm.services;

import com.skillstorm.models.CandyType;
import com.skillstorm.models.Warehouse;

public interface CandyTypeService {
	public CandyType findById(Long id);
	
	public Iterable<CandyType> findAll();
	
	public CandyType save(CandyType candyType);
	
	public void delete(Long typeId);
	
	public CandyType create(CandyType candyType);
}
