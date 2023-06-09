package com.app.entity;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSal;
	private Address ad;
	public Employee(int empId, String empName, double empSal, Address ad) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.ad = ad;
	}
	
	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", ad=" + ad + "]";
	}
	
	
	

}
