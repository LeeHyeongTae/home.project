package com.bit.apps;

public class SchoolServiceImpl implements SchoolService {
	private School[] members;
	private int count;
	
	public SchoolServiceImpl() {
		this.members = new School[3];
		this.setCount(0);
	}
	@Override
	public void add(School member) {
		members[count] = member;
		count++;
	}
	@Override
	public School[] getMembers() {
		return members;
	}
	@Override
	public void setMembers(School[] members) {
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
	public String Grade(School member) {
		String result = null;
		int average = average(member);
		switch(average /10) {
		case 9: result =  "A"; break;
		case 8: result =  "B"; break;
		case 7: result =  "C"; break;
		case 6: result =  "D"; break;
		case 5: result =  "E"; break;
		}
		return result;
	
	}
	@Override
	public int total(School member) {
		return member.getKorean()+member.getEnglish()+member.getMath();
	
	}
	@Override
	public int average(School member) {
		return total(member) / 3;
	}
	@Override
	public String PrintGrade() {
		String message = "";
		for(int i=0; i<3; i++) {
			School[] members = getMembers();
			message += String.format("[이름:%s 총점:%d 평균:%d 등급:%s]", 
					members[i].getName(),
					total(members[i]),
					average(members[i]),
					Grade(members[i]));
		}
		return message;
	}

	
}
