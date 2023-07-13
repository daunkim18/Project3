package com.skillstorm.services;

import com.skillstorm.models.CandyType;
import com.skillstorm.models.Warehouse;

public interface CandyTypeService {
	public CandyType findById(long id);
	
	public Iterable<CandyType> findAll();
	
	public CandyType save(CandyType candyType);
	
	public void delete(long typeId);
	
	public CandyType create(CandyType candyType);
}
