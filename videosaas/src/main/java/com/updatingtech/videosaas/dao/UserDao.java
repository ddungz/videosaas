package com.updatingtech.videosaas.dao;

import java.util.List;

import com.updatingtech.videosaas.model.User;

public interface UserDao {
	public void addUser(User u);
	public void updateUser(User u);
	public List<User> listUsers();
	public User getUserById(int id);
	public void deleteUser(int id);
}
