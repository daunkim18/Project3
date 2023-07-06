package services;

import com.skillstorm.models.Warehouse;

public interface WarehouseService {
	public Warehouse findById(Long id);
	
	public Iterable<Warehouse> findAll();
	
	public Warehouse save(Warehouse warehouse);
	
	public void delete(Warehouse warehouse);
}
