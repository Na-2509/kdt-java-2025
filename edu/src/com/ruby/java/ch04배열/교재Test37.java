package com.ruby.java.ch04배열;

public class 교재Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = { 90, 85, 78, 100, 98 } ;
		int sum = score[0]; // 총점
		double avg = 0.0; //평균
		int max = score[0]; //최댓값
		int min = score[0]; //최솟값
		
		for(int i = 1; i < score.length; i++) {
			sum += score[i];
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
		}
		
		avg = (double) sum / score.length; // 교개와 다른 정확한 점수로 (double) 수정추가
		System.out.println("총 점 : " + sum);
		System.out.println("평 균 : " + avg);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}

// 원래 평균값이 다르다. 90.2가 평균값이다. 
// (sum/s.lenhth) > double 의미없다
//(double) sum / s.length > 이렇게 정확히

// 성적 아닌, 다른거라면, score에 (-숫자) 일 경우도 있다. > 코드수정 필요
// for문 인덱스를 0아닌, 1부터 