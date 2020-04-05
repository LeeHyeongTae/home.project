package com.bit.apps;

public class School {
	private String name;
	private int korean;
	private int english;
	private int math;
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
	public int total() {
		return korean+english+math;
	}
	public int average() {
		return total() / 3;
	}
	public String grade() {
		String result = "F";
		switch(average()/10) {
		case 9: result =  "A"; break;
		case 8: result =  "B"; break;
		case 7: result =  "C"; break;
		case 6: result =  "D"; break;
		case 5: result =  "E"; break;
		}
		return result;
	}
}
