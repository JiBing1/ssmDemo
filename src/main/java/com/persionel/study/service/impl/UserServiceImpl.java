package com.persionel.study.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persionel.study.dao.IUserDao;
import com.persionel.study.model.User;
import com.persionel.study.service.IUserService;;

@Service("userService")
public class UserServiceImpl implements IUserService {
	private IUserDao userDao;
	@Autowired
	SqlSessionFactory sessionFactory;

	@Override
	public List<User> searchUserInfo(User user) {
		SqlSession session = sessionFactory.openSession();
	    userDao = session.getMapper(IUserDao.class);
		List<User> list = userDao.getUser(user);
		return list;
	}

}
