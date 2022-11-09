package com.cruds.db;

import java.util.List;

import com.cruds.entity.Book;

public interface BookDAO {
	
	public void create(Book b);
	
	public List<Book> getAll();
	
	public void delete(Long id);
	
	public Book edit(int ISBN);
	
	public void update(Book b);

}
