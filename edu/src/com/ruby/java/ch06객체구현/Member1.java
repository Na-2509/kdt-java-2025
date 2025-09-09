package com.ruby.java.ch06객체구현;

public class Member1 {

//		private String name;
//		private int age;
//		
//		public Member1() {
//			System.out.println("Member1() 생성자 실행");
//		}
//	
//		public void setName(String name) {
//			System.out.print("Memeber1(String) 생성자 실행 : ");
//			System.out.println(name);	
//		}
//	
//		public Member1(String name, int age) {
//			System.out.print("Memeber1(String, int) 생성자 실행 : ");
//			System.out.println(name + " : " + age);
//		}
//		
//	
//		public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			System.out.println("main() 메서드 실행");
//			new Member1();
//			
//	}

	private String name;
	private int age;
	
	public Member1() {
		this("guest");
	}		
	
	public Member1(String name) {
		this(name, 0);
	}

	public Member1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
	
	public static void main(String[] args) {
		Member1 m1 = new Member1();
		Member1 m2 = new Member1("Amy");
		Member1 m3 = new Member1("Amy", 23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
	}
	
	
}


