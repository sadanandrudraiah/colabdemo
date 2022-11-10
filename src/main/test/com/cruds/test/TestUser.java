package com.cruds.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cruds.db.UserDAO;
import com.cruds.entity.User;

@ContextConfiguration
(
  {
	  "file:src/main/webapp/WEB-INF/colabdemo-servlet.xml",
  }
)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestUser {

	@Autowired
	UserDAO dao;
	
	@Test
	public void testCreate() {
		int size = dao.getAll().size();
		dao.create(new User("Test", "empty"));
		assertTrue(dao.getAll().size() > size);
	}

}
