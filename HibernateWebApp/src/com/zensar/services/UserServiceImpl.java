package com.zensar.services;

/**
 * @author Akshat Sharma
 * @version 2.0
 * @creation_date 21st sep 2019 5.29PM
 * @modification_date 21st sep 2019 5.29PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description:It is business service interface. It is used in business layer of application.
 */

import java.util.List;

import com.zensar.daos.UserDao;
import com.zensar.entities.User;
import com.zensar.exceptions.ServiceException;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	

	

	@Override
	public void removeUser(User user) throws ServiceException {
		userDao.delete(user);
	}

	@Override
	public User findUserByUserName(String username) throws ServiceException {
		// TODO Auto-generated method stub
		User user;
		user = userDao.getByUsername(username);
		return user;

	}

	@Override
	public List<User> findAllUsers() throws ServiceException {
		// TODO Auto-generated method stub
		try {
			return userDao.getAll();
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}

	}

	@Override
	public boolean validateUser(User user) throws ServiceException {
		// TODO Auto-generated method stub

		User dbUser = findUserByUserName(user.getUsername());

		if (dbUser != null && dbUser.getPassword().equals(user.getPassword()))
			return true;
		else
			return false;
	}





	@Override
	public void addUser(User user) throws ServiceException {
		// TODO Auto-generated method stub
		userDao.insert(user);
	}





	@Override
	public void updateUser(User user) throws ServiceException {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

}
