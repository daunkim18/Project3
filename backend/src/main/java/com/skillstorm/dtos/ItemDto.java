package com.skillstorm.dtos;

public class ItemDto {
	
	private long id;
	private String name;
	private long typeId;
	private long warehouseId;
	private int quantity;
	private int popularity;
	
	public ItemDto() {
		
	}
	public ItemDto(long id, String name, long typeId, long warehouseId, int quantity, int popularity) {
		super();
		this.id = id;
		this.name = name;
		this.typeId = typeId;
		this.warehouseId = warehouseId;
		this.quantity= quantity;
		this.popularity = popularity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTypeId() {
		return typeId;
	}
	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}
	public long getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(long warehouseId) {
		this.warehouseId = warehouseId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPopularity() {
		return popularity;
	}
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	
	
	
	
}
