package com.persionel.study.model;

public class User {
	private int userId;
	private String username;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private String birthday;
	private int age;
	private String sex;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString(){
		return "{userId:" + userId + ",username:" + username + ",password:" + password + ",birthday:"
				+ birthday + ",age:" + age + ",sex:" + sex + "}";
	}
}
