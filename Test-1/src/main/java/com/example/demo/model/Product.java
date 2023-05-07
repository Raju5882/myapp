package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double cast;
	
	public Product() {
		super();
	}
	public Product(String name, Double cast) {
		super();
		this.name = name;
		this.cast = cast;
	}
	public Product(Integer id, String name, Double cast) {
		super();
		this.id = id;
		this.name = name;
		this.cast = cast;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCast() {
		return cast;
	}
	public void setCast(Double cast) {
		this.cast = cast;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cast=" + cast + "]";
	}
	

}
