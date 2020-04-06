package com.bit.apps;

import java.util.Scanner;

public class HomeEngine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member[] members = new Member[3];
		System.out.println("0. 종료 "
				+ "1. 점수계산"
				+ "2. 회원가입"
				+ "3. 회원목록"
				+ "4. 회원 나이순 정렬");
		
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
				case 2: 
						System.out.println("회원가입");
						for(int i=0; i<3; i++) {
						members[i] = join(scanner);
						}
						break;
				case 3: 
						System.out.println("가입된 회원 목록");
						for(int i=0; i<3; i++) {
						System.out.println(String.format("[이름:%s ID:%s PW:%s 나이:%d]\n", 
											members[i].getUserName(),
											members[i].getUserId(),
											members[i].getUserPw(),
											members[i].getUserAge()));
						}
						break;
				case 4:
						System.out.println("나이순으로 정렬된 회원 목록입니다.\n");
						if(members[0].getUserAge()>members[1].getUserAge()) {
							if(members[1].getUserAge()>members[2].getUserAge()) {
								System.out.println(String.format("%s \n %s \n %s \n", 
										members[0].getUserName(), members[1].getUserName(), members[2].getUserName()));
							}else if(members[0].getUserAge()>members[2].getUserAge()){
								System.out.println(String.format("%s \n %s \n %s \n", 
										members[0].getUserName(), members[2].getUserName(), members[1].getUserName()));
							}else {
								System.out.println(String.format("%s \n %s \n %s \n", 
										members[2].getUserName(), members[0].getUserName(), members[1].getUserName()));
							}
						}else if(members[1].getUserAge()>members[2].getUserAge()) {
							if(members[0].getUserAge()>members[2].getUserAge()) {
								System.out.println(String.format("%s \n %s \n %s \n", 
										members[1].getUserName(), members[0].getUserName(), members[2].getUserName()));
							}else {
								System.out.println(String.format("%s \n %s \n %s \n", 
										members[1].getUserName(), members[2].getUserName(), members[0].getUserName()));
							}
						}else {
							System.out.println(String.format("%s \n %s \n %s \n", 
									members[2].getUserName(), members[1].getUserName(), members[0].getUserName()));
						}
						break;
			}
		}
		
	}
	public static Member join(Scanner scanner) {
		Member member = new Member();
		System.out.println("이름 입력");
		member.setUserName(scanner.next());
		System.out.println("ID 입력");
		member.setUserId(scanner.next());
		System.out.println("PW 입력");
		member.setUserPw(scanner.next());
		System.out.println("나이 입력");
		member.setUserAge(scanner.nextInt());
		
		return member;
	}

}

