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
	
	@Column(nullable=false)
	private int ISBN;
	
	@Column(length=25, nullable=false)
	private String title;
	
	@Column(length=25, nullable=false)
	private double price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int iSBN, String title, double price) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", ISBN=" + ISBN + ", title=" + title + ", price=" + price + "]";
	}

}
