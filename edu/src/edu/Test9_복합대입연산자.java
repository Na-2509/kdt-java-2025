package edu;

public class Test9_복합대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 2;
		
		/*
		a += b;
		System.out.println(a); // 12 (a=a+b)를 a에 넣겠다니까, 10+2=12 최종 a값이 12로 바뀐 상태
		a -= b;
		System.out.println(a); // 10 (a=a-b)를 a에 넣겠다니까, 12-2=10 최종 a값이 10으로 바뀐 상태
		a *= b;
		System.out.println(a); // 20 (a=a*b)를 a에 넣겠다니까, 10*2=20 최종 a값이 20으로 바뀐 상태
		a /= b;
		System.out.println(a); // 10 (a=a/b)를 a에 넣겠다니까, 20/2=10 최종 a값이 10으로 바뀐 상태
		a %= b;
		System.out.println(a); // 0 (a=a%b)를 a에 넣겠다니까, 10%2=0 최종 a값이 0으로 바뀐 상태
		*/

		a = a + b; // --> 긴 식을 축약가능, a+b를 a값에 넣어라 의미 (a += b)
		System.out.println(a); //
		a = a - b; // --> a-b를 a값에 넣어라 의미 (a -= b)
		System.out.println(a);
		a = a * b; // --> a*b를 a값에 넣어라 의미 (a *= b)
		System.out.println(a);
		a = a / b; // --> a/b를 a값에 넣어라 의미 (a /= b)
		
		System.out.println(a);
		a = a % b; // --> a%b를 a값에 넣어라 의미 (a %= b)
		System.out.println(a);
	}

}
/*
복합대입 연산자 
ㄴ계산식 처리된 후 --> 처리된 값을 어떤 변수에 저장할 때 사용
ㄴ사용목적 : 식을 간단히 표현가능


 a += b : a자신에 b를 더한값을 넣어라
 a -= b : a자신에 b를 뺀 값을 넣어라
 a *= b : a자신에 b를 곱한값을 넣어라
 a /= b : a자신에 b를 나눈 몫을 넣어라
 a %= b : a자신에 b를 나눈 나머지값을 넣어라

		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);

위에서부터 순서대로 a 처리값이 변화되는 것 주의
*/