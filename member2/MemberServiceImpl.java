package com.bit.member2;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}

	@Override
	public void setMember(Member[] members) {
		this.members = members;		
	}

	@Override
	public Member[] getMember() {
			return members;
	}

	@Override
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
		
	}

	@Override
	public Member login(Member member) {
		Member result = new Member();
		System.out.println(members[0].getUserId());
		System.out.println(members[0].getPassword());
		System.out.println(member.getUserId());
		System.out.println(member.getPassword());
		for(int i=0; i<members.length; i++) {
		if(member.getUserId().equals(members[i].getUserId()) 
				&& member.getPassword().equals(members[i].getPassword())) {
			result = members[i];
			break;
		}
		}
		return result;
	}

	@Override
	public String getToString() {
		String result = "";
		for(int i=0; i<members.length; i++) {
		result += members[i].getString()+"\n";
		}
		return result;
	}

}
