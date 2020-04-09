package com.bit.apps;

public class School {
	private String name;
	private int korean, english, math;
	
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
	
	
}
