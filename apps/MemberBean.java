package com.bit.apps;

public class MemberBean {
	private String userName;
	private String userId;
	private String userPw;
	private int userAge;
	
	public MemberBean(String userName, String userId, String userPw, int userAge) {
		this.userName = userName;
		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
	}
	public void setUserName(String setUserName) {
		userName = setUserName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserId(String setUserId) {
		userId = setUserId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserPw(String setUserPw) {
		userPw = setUserPw;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserAge(int setUserAge) {
		userAge = setUserAge;
	}
	public int getUserAge() {
		return userAge;
	}
}
