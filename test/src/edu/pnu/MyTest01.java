package edu.pnu;

import java.util.Scanner;

class Phone {
	
	private String number = "010-1234-5678"; // 010-1234-5678 // ���������� ������ �߿� // ĸ��ȭ�� ���Ȱ�ȭ ����
	private String name = "ȫ�浿"; // ȫ�浿
	private String alias = "ȫ����"; // ȫ����
	
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
		
		//��ĳ�� ���鶧 ����� ����
		Scanner sc = new Scanner(System.in);
		Phone phone = new Phone(); // 
		phone.print();
		//phone.
		//phone.print3();
	}
	
}
