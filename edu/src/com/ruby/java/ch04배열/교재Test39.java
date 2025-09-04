package com.ruby.java.ch04배열;

public class 교재Test39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = { { 1, 2, 3, 4, 5}, 
						{ 6, 7, 8, 9, 10 }, 
						{ 11, 12, 13, 14, 15 }, 
						{ 16, 17,18, 19, 20 }, 
						{ 21, 22, 23, 24, 25 } } ;
		
		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if (i == j)
//					sum = sum + arr[i][j];
//			}
//		}
	
		
		// 더 간단하게 할 수 있다.
//		sum = arr[0][0] + arr[0][0] +
		for (int i = 0 ; i < arr.length ; i++) 
			sum += arr[i][i];
		
		
		
		System.out.println("합계 : " + sum);
	}

}
