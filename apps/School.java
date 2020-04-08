package com.bit.apps;

public class School {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int total;
	private int average;
	private String grade;
	
	public School(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public String Grade() {
		switch(average()/10) {
		case 9: grade =  "A"; break;
		case 8: grade =  "B"; break;
		case 7: grade =  "C"; break;
		case 6: grade =  "D"; break;
		case 5: grade =  "E"; break;
		}
		return grade;
	}
	public int total() {
		return korean+english+math;
	}
	public int average() {
		return total() / 3;
	}
	public void setName(String scanName) {
		name = scanName;
	}
	public String getName() {
		return name;
	}
	public void setKorean(int koreanScore) {
		korean = koreanScore;
	}
	public int getKorean() {
		return korean;
	}
	public void setEnglish(int englishScore) {
		english = englishScore;
	}
	public int getEnglish() {
		return english;
	}
	public void setMath(int mathScore) {
		math = mathScore;
	}
	public int getMath() {
		return math;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public String getGrade() {
		return grade;
	}
	
}
