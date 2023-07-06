package services;

import com.skillstorm.models.Item;

public interface ItemService {
	public Item findById(Long id);
	
	public Iterable<Item> findAll();
	
	public Item save(Item item);
	
	public void delete(Item item);
}
