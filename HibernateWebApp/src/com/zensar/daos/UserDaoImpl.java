package com.zensar.daos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.User;

/**
 * @author Ak
 * @version 2.0
 * @modifing_date 28.9.2019
 * 
 *
 */
@Entity
public class UserDaoImpl implements UserDao {

	private Session s;

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		s = f.openSession();

	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Transaction t = s.beginTransaction();
		s.save(user);

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Transaction t = s.beginTransaction();
		s.update(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction t = s.beginTransaction();
		s.delete(user);
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		Transaction t = s.beginTransaction();

		return s.get(User.class, username);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Query q = s.createQuery("from User");
		return q.getResultList();
	}

}
