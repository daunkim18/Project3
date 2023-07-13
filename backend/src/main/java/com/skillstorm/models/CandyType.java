package com.skillstorm.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property = "typeId")
public class CandyType {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long typeId;
	 private String description;
	 
	 @OneToMany(mappedBy = "candyType", cascade = CascadeType.MERGE)
	 private List<Item> item;
	 
	 
	 
	 public CandyType() {}

	public CandyType(long typeId, String description) {
		
		this.typeId = typeId;
		this.description = description;
	}

	public long getTypeId() {
		return typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	 
	 
	 
	 
	 
	 
}
