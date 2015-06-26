package com.updatingtech.videosaas.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.updatingtech.videosaas.dao.UserDao;
import com.updatingtech.videosaas.model.User;
import com.updatingtech.videosaas.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired(required=true)
	private UserDao userDao;

	@Override
	@Transactional
	public void addUser(User u) {
		this.userDao.addUser(u);
		
	}

	@Override
	@Transactional
	public void updateUser(User u) {
		this.userDao.updateUser(u);
		
	}

	@Override
	@Transactional
	public List<User> listUsers() {
		return this.userDao.listUsers();
	}

	@Override
	@Transactional
	public User getUserById(int id) {
		return this.userDao.getUserById(id);
	}

	@Override
	@Transactional
	public void deleteUser(int id) {
		this.userDao.deleteUser(id);
		
	}

}
