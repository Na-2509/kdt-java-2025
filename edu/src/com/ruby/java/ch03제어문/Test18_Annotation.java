package com.ruby.java.ch03제어문;

//Annotation: 주석처럼 보이지만 주석이 아니라 컴파일러/JVM에게 전달되는 메타 데이터

//@Override > 클래스 상속시 코드 재사용 정의
/**
* @author(작성자이름) 홍봉희
*/

/*
 * @author 권경민
 */




public class Test18_Annotation {

	/*
	 *  @param a 합의 첫번째 변수
	 *  @param b 합의 두번째 변수
	 *  @param a+b 결과를 반환
	 *  @param 은 매개변수에 대한 설명을 의미하는 javadoc 설명주석이고, 컴파일러(JVM)에게 전달되는 메타데이터
	 */
	
	
	/**
	 * @param a 합의 첫째 요소
	 * 
	 * @param b 합의 둘째 요소
	 * 
	 * @return a와 b를 합한 결과
	 */
	public int sum(int a, int b) {

		int salary = 0;
		salary += 10;
		System.out.println();
		//
		return a + b;
	}
}

