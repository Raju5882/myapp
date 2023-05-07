package com.app.col;

public class Product implements Comparable<Product> {

	private Integer empId;
	private String empName;
	private Double empSal;

	public Product(Integer empId, String empName, Double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Product() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Product [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public int compareTo(Product o) {
		return o.getEmpName().compareTo(this.getEmpName());
	}
}