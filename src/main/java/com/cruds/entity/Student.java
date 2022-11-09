package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	private int rollNum;
	@Column
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + "]";
	}
	

}
