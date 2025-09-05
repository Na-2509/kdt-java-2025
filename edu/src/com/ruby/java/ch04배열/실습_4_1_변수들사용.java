package com.ruby.java.ch04배열;
/*
 * 배열 사용없이 변수 5개를 사용하여 5명 점수의 평균 구하기
 * int score1,score2,score3, score4, score5;
 */
public class 실습_4_1_변수들사용 {
	//5명 점수를 score1 등의 변수로 초기화: 49, 91, 87, 67, 73
	//최대 점수, 최소 점수, 평균 점수 계산하는 코드 구현
	
	public static void main(String[] args) {
		
		int score1 = 49; 
		int score2 = 91;		
		int score3 = 87;
		int score4 = 67;
		int score5 = 73; // 이렇게 값들을 설정해 놓고 시작
		
		// 최대값(최대점수) 구하기
		int max = score1; // 기준으로 하나의 점수를 설정하고 max 값 구하는 방법 시작
		if (max < score2) // score1(49점)을 넣었을 때 score2와 비교(49<91:true)해서 작으면, 
			max = score2; // score2(91)가 더 큰값이 되니까, 91점이 score2자리에 들어감
		if (max < score3) // (91 < 87) : false
			max = score3; // 아무것도 안들어감, 실행 않고 건너뜀
		if (max < score4) // 91 < 67 : false
			max = score4; // 아무것도 안들어감, 실행 않고 건너뜀
		if (max < score5) // 91 < 73 : false
			max = score5; // 아무것도 안들어감, 실행 않고 건너뜀
		System.out.println("Max:" + max);

		// 최소값(최소점수) 구하기
		int min = score1; // 기준 넣고 최소점수 49가 들어감
		if (min > score2) //49 > 91 : false
			min = score2; // 아무것도 안들어감, 실행 않고 건너뜀
		if (min > score3) // 49 > 87 : false
			min = score3; // 아무것도 안들어감, 실행 않고 건너뜀
		if (min > score4) // 49 > 67 : false
			min = score4; // 아무것도 안들어감, 실행 않고 건너뜀
		if (min > score5) // 49 > 73 : false
			min = score5; // 아무것도 안들어감, 실행 않고 건너뜀
		System.out.println("Min:" + min); // 한번도 다른게 안들어 가고 끝남
		
		// 합과 평균 구하기
		int sum = score1 + score2 + score3 + score4 + score5;
		System.out.println("Avg:" + (sum/5.0));
	}
	
	
		
}	
	
