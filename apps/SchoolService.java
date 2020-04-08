package com.bit.apps;

public class SchoolService {
	private School[] members;
	private int count;
	
	public SchoolService() {
		this.members = new School[3];
		this.setCount(0);
	}
	
	public void add(School member) {
		members[count] = member;
		count++;
	}

	public School[] getMembers() {
		return members;
	}

	public void setMembers(School[] members) {
		this.members = members;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
