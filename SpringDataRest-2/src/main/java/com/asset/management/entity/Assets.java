package com.asset.management.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Assets {
	
	@Id
	private Long id;
	private String name;
	private int price;
	private String category;
	public Assets(long id, String name, int price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public Assets() {
		super();
		
		
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Assets [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

}
