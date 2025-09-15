package edu;

public class Test15_삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = 'F'; //변수 c에 문자 F 넣어라 --> 선언+명령
		
		//String은 참조type, gender변수명을 조건식으로 정의한 것 --> String gender = (조건식)
		String gender = (c == 'F') ? "여자" : "남자"; //c가 F와 일치하면? 여자출력, 불일치면? 남자출력
		System.out.println(gender); //변수 gender를 불렀을때 c가 F와 일치하면? 여자출력, 불일치면? 남자출력 

		//삼항연산자는 if~else 대신 쓰기도 하지만, if~else 쓸 수 없는 복잡한 명령문 안에 사용할 수도 있음
		// 다만, 삼항연산자 표현은 우선순위가 낮음 --> 다른 연산자와 함께 사용할 때는 괄호( ) 사용해서 연산자의 우선순위를 높여서 써라.
		
		/* 위의 식은 아래의 식과 동일함
		String gender2;
		if(c == 'F') 
			gender2 = "여자";
		else 
			gender2 = "남자";
			
		System.out.println(gender2);	
		*/
		
		
	}

}
