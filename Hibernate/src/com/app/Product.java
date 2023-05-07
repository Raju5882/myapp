package com.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "protab")
public class Product {

	@Id
	private Integer proId;
	private String prodName;
	private Double  prodCost;
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", prodName=" + prodName + ", prodCost=" + prodCost + "]";
	}
	public Product(Integer proId, String prodName, Double prodCost) {
		super();
		this.proId = proId;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}
	public Product() {
		super();
	}
	
}
