package com.ruby.java.ch04배열;

public class 실습_4_6_구구단_Gugudan {

	// 구구단을 순서대로 출력하는 메소드
	
	public static void printVertical() {
		
		// 코드 작성
		for(int i = 2 ; i<= 9 ; i++) {
			System.out.println(i + "단");
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
				
			}
			System.out.println("-".repeat(20));
		}
		
	}
	
	
	private static void printHorizontal() {
		// TODO Auto-generated method stub
		// 코드작성
	}
	
	private static void printColumn(int col) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		printVertical();
		printHorizontal();
		printColumn(3);
	}
	
}	
