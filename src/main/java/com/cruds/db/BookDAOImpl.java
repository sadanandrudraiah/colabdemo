package com.cruds.db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Book;

@Repository
public class BookDAOImpl implements BookDAO{

	@Autowired
	private SessionFactory sf;
	
	public void create(Book b) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(b);
		session.getTransaction().commit();
		session.close();
		
	}

	public List<Book> getAll() {
		
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Book> list =(List<Book>) session.createQuery("from Book").list(); 
		return list;
	}

	public void delete(Long id) {
		
		Session session = sf.openSession();
		session.getTransaction().begin();
		Book b = (Book) session.load(Book.class, id);
		
		session.delete(b);
		session.getTransaction().commit();
		session.close();
	}

	public Book edit(int ISBN) {
		
		Session session = sf.openSession();
		String hql = "from Book b where b.ISBN = ? ";
		
		List<Book> list = session.createQuery(hql).setInteger(0, ISBN).list();
		
		session.close();
		
		if(list.size() > 0)
		{
			return list.get(0);
		}
		
		
		else 
		{
			return null;
		}
	}

	public void update(Book b) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(b);
		session.getTransaction().commit();
		session.close();
	}

}
