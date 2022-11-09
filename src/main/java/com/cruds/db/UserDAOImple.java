package com.cruds.db;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Book;
import com.cruds.entity.User;

@Repository
public class UserDAOImple implements UserDAO {

	@Autowired
	SessionFactory sf;

	public User authenticate(String userId, String password) {

		String hql = "from User u where u.userId= ? and u.password= ?" ;	

		Session session = sf.openSession();

		List<User> list = session.createQuery(hql)
				.setString(0, userId)
				.setString(1, password)
				.list();

		session.close();

		if(list.size()>0)
		{

			return list.get(0);
		}
		else
		{
			return null;
		}
	}

	public void create(User u) {

		Session session = sf.openSession();		
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		session.close();
	}

	public List<User> getAll() {

		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<User> list =(List<User>) session.createQuery("from User").list(); 
		return list;
	}

	public void delete(Long id) {
		Session session = sf.openSession();
		session.getTransaction().begin();
		User u = (User) session.load(User.class, id);

		session.delete(u);
		session.getTransaction().commit();
		session.close();
	}

	public User findByuserId(String userId) {

		Session session = sf.openSession();
		String hql = "from User u where u.userId= ?";

		List<User> list= session.createQuery(hql)
				.setString(0, userId)
				.list();
		session.close();

		if (list.size()>0)
		{
			return list.get(0);
		}
		else
		{
			return null;
		}
	}

	public void update(User u) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(u);
		session.getTransaction().commit();
		session.close();
	}
}
