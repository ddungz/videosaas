package com.updatingtech.videosaas.service;

import java.util.List;
import com.updatingtech.videosaas.model.User;

public interface UserService {
	public void addUser(User u);
	public void updateUser(User u);
	public List<User> listUsers();
	public User getUserById(int id);
	public void deleteUser(int id);

}
