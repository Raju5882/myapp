package com.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Product {

	
	
	private int prodId;
	List<String> model;
	Map<Integer,String> map;
	Properties prop;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public List<String> getModel() {
		return model;
	}
	public void setModel(List<String> model) {
		this.model = model;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", model=" + model + ", map=" + map + ", prop=" + prop + "]";
	}
	
}
