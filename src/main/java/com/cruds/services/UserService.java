package com.cruds.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.UserDAO;
import com.cruds.entity.Book;
import com.cruds.entity.User;

@Service
public class UserService {

	@Autowired
	UserDAO dao;
	
	public User authenticate(String userId, String pwd)
	{
		return dao.authenticate(userId, pwd);
	}
	
	public void create(User u)
	{
		dao.create(u);
	
	}

	public List<User> getAll()
	{
		return dao.getAll();
	}

	public void delete(Long id)
	{
		dao.delete(id);
	}
	
	public User findByuserId(String userId)
	{
		return dao.findByuserId(userId);
	}
	
	public void update(User u) 
	{
		dao.update(u);
	}
	
}

