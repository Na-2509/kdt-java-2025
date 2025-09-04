package com.ruby.java.ch04배열;

import java.util.Random;

public class 교재Test411 {

	public static void main(String[] args) {
		int row  = Integer.valueOf(args[0]); // s
		int col  = Integer.valueOf(args[1]); // 4
		
		int [][] arr = new int[row][col];
		Random rd = new Random();
		for(int i = 0 ; i < row ; i++) {
			for (int j = 0 ; j < col ; j++) {
				arr[i][j] = rd.nextInt(0, 101);
			}
		}
		System.out.println("end");
	}

}


