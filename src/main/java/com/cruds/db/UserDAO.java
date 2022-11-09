package com.cruds.db;

import java.util.List;

import com.cruds.entity.User;


public interface UserDAO {

	public User authenticate(String userId, String password);
	
	public void create(User u);

	public List<User> getAll();

	public void delete(Long id);

	public User findByuserId(String userId);
	
	public void update(User u);
	
}





