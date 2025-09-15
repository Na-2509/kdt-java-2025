package com.ruby.java.ch03제어문;

public class Test19_if교재 {

	public static void main(String[] args) {
		//시험성적에 따라 합격 여부를 처리하는 프로그램 소스 제작
		
		/*
		
		if문 결과값(true/false)로 나오는 조건식을 지정
		 
		조건식이 true일 때 --> 
			if(조건식이 true) {if의 본문에 있는 실행문을 실행} 
			출력값 실행(보여짐) 
		
		조건식이 false일 때 --> 
			if(조건식이 false) {if의 본문에 있는 실행문은 그냥 지나침} 
			이후 출력값 실행되나, 수행한게 없으므로 최종 미출력
		
		*/
		
		// [if문]
		/*
		   실행문1;
		    
		   if(조건식) { 
		   		실행문2; 
		   		} 
		   
		   실행문3;
		 
		 */
		int score = 55; //변수 score를 선언하면서 정수 90으로 값을 초기화했음
		String result = ""; // String타입의 result변수 선언하면서, "" 빈문자열로 값을 초기화했음 
		//--> 이 명령문 써둬야 아래에서 result 결과값 출력이 가능해짐
		
		if(score >= 60) {
			result = "합격!!!";
		}
		System.out.println(result);	
	}
}

		// score 값을 55로 초기화 저장후, 다시 실행해보면, 
		// 거짓이라서 아무것도 출력되지 않음
		// "" 결과값이 빈문자열이라서 아무것도 출력되지 않음 






