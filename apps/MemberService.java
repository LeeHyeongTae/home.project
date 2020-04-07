package com.bit.apps;

public class MemberService {
	private MemberBean[] members;
	private int count;
	
	public void setMemberBean(MemberBean[] member){
		this.members = member;
	}
	public MemberBean[] getMemberBean() {
		return members;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	
	public MemberService() {
		this.members = new MemberBean[3];
		count = 0;
	}
	public void add(MemberBean member) {
		this.members[count] = member;
		count++;
	}
}
