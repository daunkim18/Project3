package services;

import com.skillstorm.models.CandyType;

public interface CandyTypeService {
	public CandyType findById(Long id);
	
	public Iterable<CandyType> findAll();
	
	public CandyType save(CandyType candyType);
	
	public void delete(CandyType candyType);
}
