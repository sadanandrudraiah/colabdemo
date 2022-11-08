package com.cruds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.BookDAO;
import com.cruds.entity.Book;

@Service
public class BookService {

	@Autowired
	BookDAO dao;

	public void create(Book b)
	{
		dao.create(b);
	}

	public List<Book> getAll()
	{
		return dao.getAll();
	}

	public void delete(int ISBN)
	{
		dao.delete(ISBN);
	}

	public Book edit(int ISBN)
	{
		return dao.edit(ISBN);
	}

	public void update(Book b)
	{
		dao.update(b);
	}


}
