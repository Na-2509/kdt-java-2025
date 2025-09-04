package com.ruby.java.ch04배열;

public class 교재Test38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\n"); // 한줄 띄움
			}
			System.out.println("\n");
		}
		
	}

}
