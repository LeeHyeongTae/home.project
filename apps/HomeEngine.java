package com.bit.apps;

import javax.swing.JOptionPane;

public class HomeEngine {

	public static void main(String[] args) {
		
		SchoolServiceImpl schoolService = new SchoolServiceImpl();
		while (true) {
			switch(JOptionPane.showInputDialog(null, "0.종료 "
					+ "1.점수입력 "
					+ "2.점수출력 "
					+ "3.회원목록 "
					+ "4.회원 나이순 정렬 ", "")) {
				case "0": return;
				case "1":
						for(int i=0; i<3; i++) {
							String[] values = JOptionPane.showInputDialog(null, "점수입력: 이름, 국어, 영어, 수학").split(",");
							School school = new School();
							school.setName(values[i]);
							school.setKorean(Integer.parseInt(values[i]));
							school.setEnglish(Integer.parseInt(values[i]));
							school.setMath(Integer.parseInt(values[i]));
						}
						break;
				case "2": //점수출
						JOptionPane.showMessageDialog(null, schoolService.PrintGrade());
						break;
//				case "3": 
//						System.out.println("가입된 회원 목록");
//						for(int i=0; i<3; i++) {
//						MemberBean[] members = memberService.getMemberBean();
//						System.out.println(String.format("[이름:%s ID:%s PW:%s 나이:%d]\n]", members[i].getUserName(),
//															members[i].getUserId(), members[i].getUserPw(), members[i].getUserAge()));
//						}
//						break;
			}
		}
	}

//				case 4:
//						System.out.println("나이순으로 정렬된 회원 목록입니다.\n");
//						if(members[0].getUserAge()>members[1].getUserAge()) {
//							if(members[1].getUserAge()>members[2].getUserAge()) {
//								System.out.println(String.format("%s \n %s \n %s \n", 
//										members[0].getUserName(), members[1].getUserName(), members[2].getUserName()));
//							}else if(members[0].getUserAge()>members[2].getUserAge()){
//								System.out.println(String.format("%s \n %s \n %s \n", 
//										members[0].getUserName(), members[2].getUserName(), members[1].getUserName()));
//							}else {
//								System.out.println(String.format("%s \n %s \n %s \n", 
//										members[2].getUserName(), members[0].getUserName(), members[1].getUserName()));
//							}
//						}else if(members[1].getUserAge()>members[2].getUserAge()) {
//							if(members[0].getUserAge()>members[2].getUserAge()) {
//								System.out.println(String.format("%s \n %s \n %s \n", 
//										members[1].getUserName(), members[0].getUserName(), members[2].getUserName()));
//							}else {
//								System.out.println(String.format("%s \n %s \n %s \n", 
//										members[1].getUserName(), members[2].getUserName(), members[0].getUserName()));
//							}
//						}else {
//							System.out.println(String.format("%s \n %s \n %s \n", 
//									members[2].getUserName(), members[1].getUserName(), members[0].getUserName()));
//						}
//						break;
			
		
		
	
//	public static MemberBean join(Scanner scanner) {
//		MemberBean member = new MemberBean();
//		System.out.println("이름 입력");
//		member.setUserName(scanner.next());
//		System.out.println("ID 입력");
//		member.setUserId(scanner.next());
//		System.out.println("PW 입력");
//		member.setUserPw(scanner.next());
//		System.out.println("나이 입력");
//		member.setUserAge(scanner.nextInt());
//		
//		return member;
//	}
	
}

