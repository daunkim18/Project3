package com.skillstorm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.CandyType;
import com.skillstorm.repositories.CandyTypeRepository;

@Service
public class CandyTypeServiceImplementation implements CandyTypeService{
	@Autowired
	private CandyTypeRepository repo;
	
	@Override
	public CandyType findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Iterable<CandyType> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public CandyType save(CandyType candyType) {
		// TODO Auto-generated method stub
		return repo.save(candyType);
	}

	@Override
	public void delete(Long typeId) {
		repo.deleteById(typeId);
		
	}

	@Override
	public CandyType create(CandyType candyType) {
		// TODO Auto-generated method stub
		return null;
	}

}
