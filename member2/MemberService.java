package com.bit.member2;

public interface MemberService {
	public void setMember(Member[] members);
	public Member[] getMember();
	public void setCount(int count);
	public int getCount();
	public void add(Member member);
	public Member login(Member member);
	public String getToString();
	}
