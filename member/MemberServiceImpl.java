package com.bit.member;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	
	public MemberServiceImpl() {
	 this.members = new Member[5]; 
	 this.count = 0;
	}
	@Override
	public Member[] getMembers() {
		return members;
	}
	@Override
	public void setMembers(Member[] members) {
		this.members = members;
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	
	
}
