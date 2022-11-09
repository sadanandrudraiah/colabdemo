package com.cruds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.StudentDAO;
import com.cruds.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO dao;
	
	public List<Student> getAll()
	{
		return dao.getAll();
	}
	
	public void create(Student s)
	{
		dao.create(s);
	}
	
	public void delete(int rollNum)
	{
		dao.delete(rollNum);
	}
	
	public Student edit(int rollNum)
	{
		return dao.edit(rollNum);
	}
	
	public void update(Student s)
	{
		dao.update(s);
	}

}
