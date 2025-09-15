package edu;

public class Test16_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*데이터 type은 다른타입으로 자바 자동type변경 or 개발자가 직접type변경 할 수 있다. <-- (type casting)
		
		1. 자동타입변경 : 명령문 실행되면서 자바 자동변경
			ㄴ작은타입 데이터를 큰타입 변수에 저장할 때 발생 
			ㄴ자바가 알아서 내부 처리함 --> 오류 없음

		2. 직접타입변경 : 개발자가 직접변경
			ㄴ반대로, 큰타입 데이터를 작은타입 변수에 저장할 때 오류발생
			ㄴ개발자가 직접 타입변경 해줘야 함
		
		*/
		
		byte a = 23; //  
		int b = a;
		System.out.println(b); //23출력
		
		byte c = 23;
		short d = 47;
		int e = 65;
		int f = c + d + e;
		System.out.println(f); //135출력
		
		int g = 23;
		//byte h = g; //이렇게 쓰면 오류발생
		//4byte 크기의 23을 1byte크기 h에 넣을 수 없으나, 
		//byte는 0~255 or -128~127까지 표현가능하므로 --> 강제로 집어넣을 수는 있다
		//(type casting)
		byte h = (byte) g; //(소괄호) 타입으로 집어넣으라면 명령, ( ) 를 가장먼저 처리
		System.out.println(h); //23출력
		
		byte i = 10;
		byte j = 20;
		//byte k = (i+j); //이렇게 쓰면 오류발생, 수크기 문제아니라, 연산자(+)기호 때문
		//연산자 이용한 연산작업은 정수타입 int로 변환되어 수행됨
		//byte로 선언해도 int로 자바가 계산하므로 계산된 int값을 다시 byte에 넣을 수 없게됨
		//연산 도중은 int연산이라 문제없고
		//연산 이후에 타입캐스팅 해주면 해결
		byte k = (byte) (i+j); // + 연산을 먼저 수행하기 위해 (i+j) 소괄호 감싸주면 연산을 먼저처리함 --> 이후 타입캐스팅 처리됨
		System.out.println(k); //30출력
		
		
		
	}

}
