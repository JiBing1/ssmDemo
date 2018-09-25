package com.persionel.study.dao;

import java.util.List;

import com.persionel.study.model.User;

public interface IUserDao {
	public List<User> getUser(User user);
	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(User user);
}
