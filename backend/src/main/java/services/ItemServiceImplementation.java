package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Item;
import com.skillstorm.training.repositories.ItemRepository;

@Service
public class ItemServiceImplementation implements ItemService{
	
	@Autowired
	private ItemRepository repo;
	
	@Override
	public Item findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Iterable<Item> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Item save(Item item) {
		// TODO Auto-generated method stub
		return repo.save(item);
	}

	@Override
	public void delete(Item item) {
		repo.delete(item);
		
	}

}
