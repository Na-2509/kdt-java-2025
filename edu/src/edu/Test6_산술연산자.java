package edu;

public class Test6_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10 + 2;
		int b = 10 - 2;
		int c = 10 * 2;
		int d = 10 / 2;
		int e = 10 % 2;
		
		System.out.println(a); // 12출력
		System.out.println(b); // 8출력
		System.out.println(c); // 20출력
		System.out.println(d); // 5출력
		System.out.println(e); // 0출력

		//한줄로 요약 출력
		System.out.println(a + b + c + d + e); // a+b+c+d+e=45값이 출력됨
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e); // 12, 8, 20, 5, 0 출력됨
		System.out.println("(" + a + ", " + b + ", " + c + ", " + d + ", " + e + ")"); // (12, 8, 20, 5, 0) 출력됨
		//System.out.println(a, b, c, d, e); // 출력안됨
		System.out.println("abcde"); // abcde 출력됨
		//System.out.println(abcde); // 출력안됨

		
	}
	
	

}
