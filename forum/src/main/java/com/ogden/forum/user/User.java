package com.ogden.forum.user;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private String name;
	private String email;
	private String password;
	private int userid;
	
	public User() {
		
	}
	
	public User(String name, String email, String password, int userid) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.userid = userid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	

}
