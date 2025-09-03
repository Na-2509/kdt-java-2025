package com.ruby.java.ch03제어문;

public class 교재_Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12;
		int b = 2;
		char op = '+';
		
		
		switch(op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
			
		default:
			System.out.println("연산없음"); 
		}
		
		/*
		 * switch 문은 switch, case, break까지 한 세트로 작성 습관화 할 것 
		 * 지정된 연산기호 외에 다른 연산기호 입력됐을 경우 default 제시해주면 됨
		 */
		
		
	}

}
