package com.skillstorm.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;

	private String itemName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_id")
	private Long warehouseId;
	
	
	private int quantity;
	private Long typeId;
	private int popularity;

	public Item() {
		super();
	}

	public Item(Long itemId, String itemName, Long warehouseId, Long typeId, int quantity, int popularity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.warehouseId = warehouseId;
		this.typeId = typeId;
		this.quantity = quantity;

	}

	public Long getitemId() {
		return itemId;
	}

	public void setId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Long getType() {
		return typeId;
	}

	public void setType(Long typeId) {
		this.typeId = typeId;
	}

	public int getSoldBy() {
		return quantity;
	}

	public void setSoldBy(int quantity) {
		this.quantity = quantity;
	}

	public int getPopularity() {
		return popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

	

}
