package com.brainwave.task2.Entity;

public class MedicalSupply {

	int id;
	String name;
	int quantity;
	
	public MedicalSupply(int id, String name, int quantity) {
		
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "MedicalSupply [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
}
