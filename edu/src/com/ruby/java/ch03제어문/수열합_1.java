package com.ruby.java.ch03제어문;

public class 수열합_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for 적고, ctrl+space 눌러서 두번째 것 넣으면 자동으로 아래 for문 작성된다.
		 * do 적고, ctrl+space 눌러서 첫번째 것 넣으면 자동으로 아래 do문 작성된다.
		 * while 적고, ctrl+space 눌러서 3번째 것 넣으면 자동으로 아래 while문 작성된다.
		 * break, continue만 알면 됨
		 */
		
		int n = 0;
		for (int i = 0; i < 100; i++) {
			if ( n > 10)
				continue;
			n += i*2;
			if ( n > 20)
				break;
			
		}
		
		/*
		 * debug(F11) : Run 에서 실행 > 진행하면, 오른쪽에 variable(변수값), breakpoint, Expressions
		 * Window > Show View > Variables(alt+shift+Q, V) 로도 찾을 수 있다. > 변수들 보는 것
		 * Window > Show View > Expressions 으로도 찾기 > Expressions 변수들의 계산식 값의 상태를 표현식 직접 써서 확인할 수 있다. 
		 * 오른쪽 영역에 디버깅 나옴
		 * 디버깅 상태에서 소스창의 변수 위에 마우스 올리면, hover 기능 활성화되어, 현재 변수값을 미리 볼 수 있따. 
		 * 중단점에서 마우스 우클릭 > Breakpoint properties 클킬 > 책에 없는 내용(p. 
		 */

		
		do {
			if ( n > 20 )
				break;
			if ( n < 10 )
				continue;
			
		} while ( n < 40 );
		
		while ( n < 40) {
			if ( n > 20 )
				break;
			if ( n < 10)
				continue;
			
		} 
		
		
		/*
		 * 1~100 수열의 합 구하는 for 문 작성
		 * int sum = 0;
		 * for (;;) {
		 *   sum += i;
		 * }
		 * sysout("sum = " + sum);
		 */
		
		
	}

}
