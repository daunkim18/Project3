package services;

import org.springframework.beans.factory.annotation.Autowired;

import com.skillstorm.models.Warehouse;
import com.skillstorm.training.repositories.WarehouseRepository;

public class WarehouseServiceImplementation implements WarehouseService {

	@Autowired
	private WarehouseRepository repo;
	
	@Override
	public Warehouse findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Iterable<Warehouse> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Warehouse save(Warehouse warehouse) {
		// TODO Auto-generated method stub
		return repo.save(warehouse);
	}

	@Override
	public void delete(Warehouse warehouse) {
		repo.delete(warehouse);
		
	}

}
