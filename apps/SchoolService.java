package com.bit.apps;

public interface SchoolService {
	
	public void add(School memeber);
	public School[] getMembers();
	public void setMembers(School[] members);
	public int getCount();
	public void setCount(int count);
	public String Grade(School member);
	public int total(School member);
	public int average(School member);
	
}
