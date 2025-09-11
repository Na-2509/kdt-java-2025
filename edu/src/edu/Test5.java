package edu;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A1 = 10;  // 변수선언과 초기값 입력을 한줄에 씀
		int A2 = 20;
		
		int A3 = A1 + A2; //30
		int A4 = A2 - A1; //10
		
		System.out.println(A3 +", " + A4); //30,10 출력
		System.out.println("A3" + ", " + "A4"); // "A3" "A4"를 한개의 독립된 문자 하나로 해석해버리니까 --> A3, A4로 출력됨 
		System.out.println(A3 + A4); //40 출력
		//System.out.println(A3, A4); // 출력안됨
		
	}

}

/* 자바 산술연산자란? [계산을 위해 약속된 기호들]
 
 * + 더하기
 * - 빼기
 * * 곱하기
 * / 나누기
 * % 나머지값 구하기 10%2
 
  */


