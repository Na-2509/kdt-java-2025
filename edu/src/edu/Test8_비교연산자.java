package edu;

public class Test8_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		System.out.println(a > b); // a가 b보다 큰지 판단함 10 > 20 --> false
		System.out.println(a < b); // a가 b보다 작은지 판단 10 < 20 --> true
		System.out.println(a >= b); // a가 b보다 크거나 같은지 판단 10 >= 20 -->false
		System.out.println(a <= b); //a가 b보다 작거나 같은지 판단 10 <= 20 --> 
		System.out.println(a == b);
		System.out.println(a != b);
	}

}


/* 비교연산자 6개
 
부등호(> , <) 이퀄( = ) 로 구성
=은 항상 오른쪽 배치
>=, <= OR 연산으로 이해할 것 --> 둘 중 하나만 맞으면 true, 둘 중 하나도 맞지않으면 false
! 부정연산자(not 연산자) --> boolean 타입의 값은 true/false --> boolean 타입의 값을 서로 변환해주는 기능
ㄴ연산대상이 true이면 false로 변환
ㄴ연산대상이 false이면 true로 변환
ㄴ직접 사용 or 조건식에 자주사용

a(~가) > b(~보다)  <-- 왼쪽이 판단해야 할 대상, 오른쪽이 비교되는 대상 

*/