package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Parentclass {

	@Value("1")
	private int id;
	@Autowired
	private ChildClass c;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ChildClass getC() {
		return c;
	}
	public void setC(ChildClass c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Parentclass [id=" + id + ", c=" + c + "]";
	}
	
}
