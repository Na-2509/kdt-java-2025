package edu;

public class Test13_비트연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//비트연산자 확인 예제
		//(참고) 소스에 사용된 Integer.toBinaryString()은 변수의 값을 2진수로 표현하는 함수
		
		byte a = 0b00010001; //2진수 표현에는 0b붙이고 시작함 --> 17(십진수)
		byte b = 0b00100010; //34(십진수)
		
		int c = a & b; // 2진수 a와 2진수 b를 And 연산 --> 모두 1일때만 결과1 출력 
		System.out.println(Integer.toBinaryString(c)); // 00000000 --> 0출력
		
		int d = a | b; // 2진수 a와 2진수 b를 Or 연산 --> 하나라도 1이면 결과1 출력
		System.out.println(Integer.toBinaryString(d)); // 00110011 --> 110011출력
		
		int e = a ^ b; //2진수 a와 2진수 b를 Xor 연산 --> 비트값이 서로다를때만 결과1 출력
		System.out.println(Integer.toBinaryString(e)); // 00110011 -- > 110011출력
		
		int f = 12;
		int g = (~f) + 1; // 음수 변환 코드
		System.out.println(g); // -12출력
		
		int h = f << 1; // f를 왼쪽 비트칸으로 1회 이동, 이동된 곳은 0으로 채움
		int i = f >> 1; // f를 오른쪽 비트칸으로 1회 이동, 이동된 곳을 부호비트로 채움 
		//12를 2진수로 변환 --> 01100 
		//h : 01100 을 왼쪽으로 비트이동하면 --> 11000 --> 이걸 다시 10진수변환 --> 16+8=24
		//i : 01100 을 오른쪽으로 비트이동하면 --> 00110 --> 이걸 다시 10진수변환 --> 4+2=6 
		
		System.out.println(h); // 24출력
		System.out.println(i); // 6출력
		
	}

}
