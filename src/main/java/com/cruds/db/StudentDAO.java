package com.cruds.db;

import java.util.List;

import com.cruds.entity.Student;

public interface StudentDAO {
	
	public void create(Student s);
	
	public List<Student> getAll();
	
	public void delete(int rollNum);
	
	public Student edit(int rollNum);
	
	public void update(Student s);
	
}
