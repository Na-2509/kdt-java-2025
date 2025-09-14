package com.ruby.java.ch03제어문;

import java.util.Scanner; // 자바가 우리보고 편히 쓰라고 만들어 놓은 클래스(도구) <-- 이렇게 갖다쓸 때 출처를 class 밖에 선언하고 사용

public class Test19_if문_스캐너 {
	public static void main(String[] args) {
/*
		자바에서 Scanner 사용하려면, 
		1) java.util.Scanner를 import 하고 Scanner 객체를 생성한 후, 
		--> import java.util.Scanner;  (java.util 패키지의 Scanner를 임포트 함)
		
		2) Scanner 클래스의 생성자에 System.in을 넣어 Scanner 객체를 생성한다. --> Scanner 객체 생성
		--> System.in은 키보드 입력을 받는 표준입력 스트림
		--> Scanner sc = new Scanner(System.in);
		
		3) Scanner 객체의 다양한 메서드를 사용하여 원하는 타입의 데이터를 입력받을 수 있다.
		ㄴ`next( )` 또는 `nextLine( )` 등의 메서드를 이용해 원하는 타입의 입력을 받아야 한다.
		ㄴSystem.in을 생성자에 전달하여 키보드 입력을 받으며,

		□ `next( )` --> 한 단어(공백기준)를 입력받음 // 공백기준, 한단어씩 문자열 입력받음
		□ `nextLine( )` --> 한 줄(개행 문자까지)단위로 입력받음 // 한줄 전체 입력받음

		□ `nextInt( )` --> 정수(int)값 입력받음
		□ `nextLong( )` --> 정수(long)값 입력받음

		□ `nextFloat( )` --> 실수(float)값 입력받음
		□ `nextDouble( )` --> 실수(double)값 입력받음
*/		
		
		
		Scanner scanner = new Scanner(System.in); //스캐너 쓴다고 선언했으니, 아래에 이제 사용하면 됨
		
		//System.out.println("하고싶은 말을 입력하세요: ");
		
		//System.out.println("If 문 실습");
		System.out.print("택배 품목을 입력하세요: \n");
		System.out.print("택배 무게를 입력하세요: ");
		
		/* 
		 ln : 한줄 아래로 내려간다 의미
		 		ln 있고 없는 것의 마우스 커서 위치 차이남
		 scanner 빨간줄 생기면 마우스커서 > import 3행 자동 추가해 준다.
		 system. in > in은 Scanner 객체의 입력소스로 지정되키보드 입력을 받는 표준입력 스트림
		 ㄴ자바의 표준입력 스트임
		 ㄴ키보드 장치를 직접 제어하는 객체
		 ㄴ사용자가 키보드로 입력한 데이터를 바이트 단위로 전달하는 역할
		 
		 Scanner 클래스
		 ㄴ(System.in)에게서 바이트 type 데이터를 받아 
		 ㄴ사람이 쉽게 이해할 수 있는 문장이나 숫자 등으로 변환하여 제공하는 클래스
		 
		 Scanner scanner = new Scanner(System.in);
		 ㄴ이 문장은 Scanner 클래스의 객체(sc)를 생성하는 과정
		 ㄴ이때 (System.in)이 Scanner 객체의 입력소스로 지정되어, 키보드 입력을 Scanner가 처리할 수 있도록 연결하는 것
		 
		 객체생성 이후, `next( );` 등의 메서드 사용해서 입력받은 값을 읽어낼 수 있음


		 */
		
		//System.out.println("하고싶은 말을 입력하세요: ");
		
		//System.out.println("If 문 실습");
		//System.out.print("택배 무게를 입력하세요: ");
		
		// 택배요금 계산 코드 작성하기
		
		int weight = scanner.nextInt(); //스캐너 객체인 scanner를 이용해 사용자의 입력으로부터 정수(int)값을 읽어와서 weight라는 변수에 저장하라는 뜻
		//변수명  변수이름  = 대입연산자, scanner.nextInt()의 결과를 weight 변수에 넣어줌(할당)
		//scanner : 스캐너 클래스의 객체이름, System.in에서 입력을 받아오는 역할
		//nextInt() : 스캐너 객체의 메서드 중 한, 입력받은 데이터를 int타입으로 반환해줌, 사용자 입력값 중, 정수부분만 인식해서 반환하는 역할

		String name = scanner.nextLine( );	
		/*
		 
		 * 무게에 따라 택배 요금 계산하여 출력한다
		 * 1000 이하 3000
		 * 1000 < w <= 5000 5000
		 * 5000 < w <= 10000 8000
		 * 10000 < w  12000
		 
		 * 출력: 택배 요금은 0000원입니다
		 */

		
		int fare = 0;
		if (weight < 1000) {
			fare = 3000;}
		else if (1000 < weight && weight < 5000) {
			fare = 5000;}
		else if (5000 < weight && weight < 10000) {
			fare = 8000;}
		else {
			fare = 12000;}
		
		
		/*
		 * 위의 명령서들을 출력하려면 sysout~ 출력
		 */
		
		System.out.println("택배 요금은 " + fare + "원입니다.");
		
		//scanner.close();
		
		/*
		int fare = 0;
		if (weight <= 1000) {
			System.out.println("택배 요금은 " + "3000원 입니다.");
		} else if (1000 < weight && weight <= 5000) { 
			System.out.println("택배 요금은 " + "5000원 입니다.");		
		} else if (5000 < weight && weight <= 10000) { 
			System.out.println("택배 요금은 " + "8000원 입니다.");
		} else {  
			System.out.println("택배 요금은 " + "10000원 입니다.");		
		}
		*/
		
		
		
	}
}

