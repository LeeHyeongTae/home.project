package com.bit.practice;

public class Gugudan {
	public static void main(String[] args) {
		int[][] gugudan = new int[10][10];
		for(int i=1; i<10; i++) {
			for(int dan=2; dan<10; dan++) {
				gugudan[dan][i] = dan*i;
			}
		}
		for(int i=1; i<10; i++) {
			for(int dan=2; dan<10; dan++) {
				System.out.print(dan+"x"+i+"="+gugudan[dan][i]+"\t");
			}
			System.out.println();
		}
		
	}
}
