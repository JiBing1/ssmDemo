package com.persionel.study.service;

import java.util.List;

import com.persionel.study.model.User;

public interface IUserService {
	List<User> searchUserInfo(User user);
	int insertUserInfo(User user);
}
