package com.persionel.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.persionel.study.model.User;
import com.persionel.study.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/getUserInfo")
	@ResponseBody
	public List<User> getUserInfo(User user){
		System.out.println(user);
		List<User> list = userService.searchUserInfo(user);
		System.out.println(list);
		return list;
	}
}
