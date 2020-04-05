package com.bit.apps;

import java.util.Scanner;

public class HomeEngine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("프로그램을 실행합니다.\n "
				+ "0.종료 \n "
				+ "1. 점수계산\n");
		while (true) {
			switch(scanner.nextInt()) {
				case 0: 
						System.out.println("종료합니다.");
						return;
				case 1: 
						School school = new School();
						System.out.println("성적계산\n"
								+ "이름 입력하세요.");
						school.setName(scanner.next());
						System.out.println("국어점수");
						school.setKorean(scanner.nextInt());
						System.out.println("영어점수");
						school.setEnglish(scanner.nextInt());
						System.out.println("수학점수");
						school.setMath(scanner.nextInt());
						System.out.println(String.format("[%s: 총점: %d 평균: %d 학점: %s]", 
								school.getName(), school.total(), school.average(), school.grade()));
						break;
			}
		}
		
	}

}
