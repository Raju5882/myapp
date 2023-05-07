package com.app.entity;

public class Product implements Comparable<Product> {

	private int ProdId;
	private String ProdName;
	private double Prodsal;

	public int getProdId() {
		return ProdId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 3;
		result = prime * result + ProdId;
		result = prime * result + ((ProdName == null) ? 0 : ProdName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Prodsal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		System.out.println("hash code method" + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("from equals method" + obj.toString());
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (ProdId != other.ProdId)
			return false;
		if (ProdName == null) {
			if (other.ProdName != null)
				return false;
		} else if (!ProdName.equals(other.ProdName))
			return false;
		if (Double.doubleToLongBits(Prodsal) != Double.doubleToLongBits(other.Prodsal))
			return false;
		return true;
	}

	public void setProdId(int prodId) {
		ProdId = prodId;
	}

	public String getProdName() {
		return ProdName;
	}

	public void setProdName(String prodName) {
		ProdName = prodName;
	}

	public double getProdsal() {
		return Prodsal;
	}

	public void setProdsal(double prodsal) {
		Prodsal = prodsal;
	}

	public Product(int prodId, String prodName, double prodsal) {
		super();
		ProdId = prodId;
		ProdName = prodName;
		Prodsal = prodsal;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [ProdId=" + ProdId + ", ProdName=" + ProdName + ", Prodsal=" + Prodsal + "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
