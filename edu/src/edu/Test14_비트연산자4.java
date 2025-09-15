package edu;

public class Test14_비트연산자4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//비트연산자 활용, 대문자-소문자 서로 변환하는 프로그램 구현
		
		char c = 'A'; //한개 문자 A를 c변수에 넣음 --> 문자 'A'에 해당하는 아스키코드 값이 정수로 c에 저장됨 --> A 아스키코드 값은 65
		c ^= (1 << 5); // 1을 왼쪽으로 5자리만큼 이동시킨 결과값을 --> c(아스키코드값 65)값과 비트Xor 연산한 결과를 최종 c에 넣어라;
		
		//
		
		
		System.out.println(c); // 소문자 a출력
		
		
		
		
		
		
	}

}
