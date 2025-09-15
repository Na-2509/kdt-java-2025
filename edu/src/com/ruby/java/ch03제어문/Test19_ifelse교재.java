package com.ruby.java.ch03제어문;

public class Test19_ifelse교재 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//시험성적에 따라 합격/불합격을 처리하는 프로그램 소스 제작
		
		/*
		
		if ~ else 문 --> 결과값(true/false)로 나오는 조건식을 지정 // true/false 모두를 고려함
		 
		 
		조건식이 true일 때 --> 
			if(조건식이 true) {if의 본문에 있는 실행문을 실행} 
			출력값 실행(보여짐) 
		
		조건식이 false일 때 --> 
			if(조건식이 false) {if의 본문에 있는 실행문은 그냥 지나침} 
			else{본문의 실행문을 실행}
			출력값 실행(보여짐)
		
		if ~ else문은 true/false 둘 중 하나만을 무조건 실행하는 특징
		ㄴ둘 다 실행하지도 못하고, 
		ㄴ둘 다 실행 않하지도 못하고,
		ㄴ오로지 둘 중 하나는 무조건 실행하게 구성된 제어문
		
		*/
			
		
		
		// [if ~ else 문]
		/*
		   실행문1;
		    
		   if(조건식=참) { 
		   		실행문2; 
		   	} else { 
		   		실행문3;
			}	 
			실행문4;	 
				 
		 */
		
		/*
		int score = 50;
		String result = "";
		
		if(score >= 60) {
			result = "합격!!!";
		} else {
			result = "불합격. 다음 기회에...";
		}

		System.out.println(result);
	    */

		//if ~ else 문은 필드 선언에서 삼항연산자로 축약 표현 가능함
		//조건문 안써도 됨
		//System.out.println( ); 
		
		//삼항연산자는 if~else 대신 쓰기도 하지만, if~else 쓸 수 없는 복잡한 명령문 안에 사용할 수도 있음
		// 다만, 삼항연산자 표현은 우선순위가 낮음 --> 다른 연산자와 함께 사용할 때는 괄호( ) 사용해서 연산자의 우선순위를 높여서 써라.

		
		
		int score = 50;
		String result = (score >= 60 ? "합격" : "불합격. 다음 기회에 만나요!"); // 조건식을 아예 변수선언 할 때 넣어버리면 끝
		
		System.out.println(result);
		
	}
}