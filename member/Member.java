package com.bit.member;

public class Member {
	private String name, id, password, ssn;
	
	public Member(String name, String id, String password, String ssn) {
		this.name = name;
		this.id = id;
		this.password =  password;
		this.ssn = ssn;
	}

//	public void add(String name,String id, String password, String ssn) {
//		this.name = name;
//		this.id = id;
//		this.password =  password;
//		this.ssn = ssn;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	public String getMembers() {
		return name+id+password+ssn;
	}
	
}
