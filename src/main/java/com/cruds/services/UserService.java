package com.cruds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.UserDAO;
import com.cruds.entity.User;

@Service
public class UserService {

	@Autowired
	UserDAO dao;
	
	public User authenticate(String userId, String pwd)
	{
		return dao.authenticate(userId, pwd);
	}

}
