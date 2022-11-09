package com.cruds.db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Book;
import com.cruds.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private SessionFactory sf;

	public void create(Student s) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
	}

	public List<Student> getAll() {
		Session session = sf.openSession();
		List<Student> list = (List<Student>) session.createQuery("from Student").list();
		return list;
	}

	public void delete(int rollNum) {
		Session session = sf.openSession();
		session.getTransaction().begin();
		Student s = (Student) session.load(Student.class, rollNum);

		session.delete(s);
		session.getTransaction().commit();
		session.close();
	}

	public Student edit(int rollNum) {
		Session session = sf.openSession();
		String hql = "from Student s where s.rollNum = ? ";

		List<Student> slist = session.createQuery(hql).setInteger(0, rollNum).list();

		session.close();

		if(slist.size() > 0)
		{
			return slist.get(0);
		}
		else 
		{
			return null;
		}
	}


	public void update(Student s) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(s);
		session.getTransaction().commit();
		session.close();
	}
}
