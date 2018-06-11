package org.Right.Api.Entity;

public class User {
	public String UserId;
	public String UserName;
	public String PassWord;

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
