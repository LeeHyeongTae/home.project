package com.bit.member2;

public class Member {
	private String name, userId, password, ssn, addrs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getString() {
		return "이름:"+name+" ID:"+userId+" 비밀번호:"+password+" 주민번호:"+ssn+" 주소:"+addrs;
	}
	
}
