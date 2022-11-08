package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length=25, nullable=false)
	private String title;
	
	@Column(length=25, nullable=false)
	private int ISBN;
	
	@Column(length=25, nullable=false)
	private double price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int iSBN, double price) {
		super();
		this.title = title;
		ISBN = iSBN;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", ISBN=" + ISBN + ", price=" + price + "]";
	}
	
}
