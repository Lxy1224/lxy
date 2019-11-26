package com.stx.zh.model;

public class User2 {
	private String username;//用户名
	private String password;//密码
	private String phone;//电话
	private String email;//邮箱
	private String youji;//我的游记
	private String state;//1=管理员，0=普通用户

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getYouji() {
		return youji;
	}
	public void setYouji(String youji) {
		this.youji = youji;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
