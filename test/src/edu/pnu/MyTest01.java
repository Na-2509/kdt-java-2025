package edu.pnu;

import java.util.Scanner;

class Phone {
	
	private String number = "010-1234-5678"; // 010-1234-5678 // 접근제한자 갈수록 중요 // 캡슐화는 보안강화 유리
	private String name = "홍길동"; // 홍길동
	private String alias = "홍사장"; // 홍사장
	
	private void print1() {
		System.out.println(number);
	}
	
	private void print2() {
		System.out.println(name);
	}

	private void print3() {
		System.out.println(alias);
	}

	public void print() {
		print1();
		print2();
		print3();
	}
}


public class MyTest01 {

	public static void main(String[] args) {
		
		//스캐너 만들때 사용한 문법
		Scanner sc = new Scanner(System.in);
		Phone phone = new Phone(); // 
		phone.print();
		//phone.
		//phone.print3();
	}
	
}
