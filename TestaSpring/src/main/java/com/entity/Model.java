package com.entity;

public class Model {

	
	private int Mid;
	private String Mcode;
	private String Mnumber;
	public Model(int mid, String mcode, String mnumber) {
		super();
		Mid = mid;
		Mcode = mcode;
		Mnumber = mnumber;
	}
	public int getMid() {
		return Mid;
	}
	public void setMid(int mid) {
		Mid = mid;
	}
	public String getMcode() {
		return Mcode;
	}
	public void setMcode(String mcode) {
		Mcode = mcode;
	}
	public String getMnumber() {
		return Mnumber;
	}
	public void setMnumber(String mnumber) {
		Mnumber = mnumber;
	}
	@Override
	public String toString() {
		return "Model [Mid=" + Mid + ", Mcode=" + Mcode + ", Mnumber=" + Mnumber + "]";
	}
	
}
