package com.SpringBootDataJPA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usertable")

public class User {
	@Id
	private int userid;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;

	public User() {
		super();
	}

	public User(int userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}

	public long getuserid() {
		return userid;
	}

	public void setuserid(int userid) {
		this.userid = userid;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
