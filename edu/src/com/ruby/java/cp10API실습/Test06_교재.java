package com.ruby.java.cp10API실습;

import java.util.HashMap;

public class Test06_교재 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word[] = { "BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER" };
		String meaning[] = { "꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다" };
		
		HashMap<String, String> dis = new HashMap<String, String>();
		
		for (int i = 0; i < word.length; i++) {
			dis.put(word[i], meaning[i]);
		}
			
		System.out.println(dic);
		System.out.println(dic.size())); // 4
		
		// [HEAVEN, BUMBLEBEE, 
		
		
	}

}
