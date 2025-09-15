package com.ruby.java.ch03제어문;

public class Test19_if문_나혼자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		시험성적 합격여부 처리 프로세스" 를 코딩해보려면 무엇이 필요할까?

/*
		필요한 재료
		- 입력할 정보들 --> 학생이름 : 과목이름 : 과목당 점수
		- 합격/불합격 기준점수 --> 60점
		- 60점 이상이면? --> "합격" 출력
		- 60점 미만이면? --> "불합격" 출력 
*/
		//일단 먼저....음...그냥...
		
		String name;
		String math;
		String eng;
		int scoreM;
		int scoreE;
		int sum;
		float avg;
		
		name = "홍길동";
		math = "수학";
		eng = "영어";
		scoreM = 100;
		scoreE = 59;
		sum = scoreM + scoreE;
		avg = sum/2;
		
		String result = "";
		
		//홍길동의 수학과 영어 점수 출력
		/*
		 System.out.println("이름" + ": " + name); 
		 System.out.println("수학 " + "= " + scoreM); 
		 System.out.println("영어 " + "= " + scoreE );
		 */		
		
		//합격 불합격 구분하기
		if(scoreM >= 60 && scoreE >= 60) { 
			result = "합격";
		 } 

		else { 
			result = "Sorry 다음 기회에...";
		}

		System.out.println("이름" + ": " + name + ", " + result);
		
		
		
	}

}
