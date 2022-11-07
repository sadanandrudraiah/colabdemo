package com.cruds.db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.entity.User;

@Repository
public class UserDAOImple implements UserDAO {

	@Autowired
	SessionFactory sf;

	public User authenticate(String userId, String pwd) {

		String hql = "from User u where u.userId= ? and u.password= ?" ;	

		Session session = sf.openSession();

		List<User> list = session.createQuery(hql)
							.setString(0, userId)
								.setString(1, pwd)
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

}
