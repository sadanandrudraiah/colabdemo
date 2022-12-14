package com.cruds.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;
import com.cruds.db.BookDAO;
import com.cruds.entity.Book;

@ContextConfiguration
(
  {
	  "file:src/main/webapp/WEB-INF/colabdemo-servlet.xml",
  }
)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestBook {

	@Autowired
	BookDAO dao;
	
	@Test
	public void testGetAll() {
		List<Book> list = dao.getAll();
		assertTrue(list.size() > 0);
	}
	
	

}
