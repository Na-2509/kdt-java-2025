package edu;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float exchageRate = 1136.50F;
		double USDAmount = 600.50;
		double KRWAmount = 682468.25;
		
		System.out.println(exchageRate);
		System.out.println(USDAmount);
		System.out.println(KRWAmount);
	}

}

//실수는 기본적으로 메모리에 임시저장할 때 double 타입으로 저장됨
//변수에 값 저장하려 할 때 문제 발생
//8byte 데이터를 4byte데이터에 저장하려니 공간이 좁아 저장불가

//오류해결법 3가지
//애초에 임시저장할 때 float타입으로 저장하면 된다. 방법 3개
//1. float exchageRate = (float) 1136.50;
//2. float exchageRate = 1136.50F;
//3. float exchageRate = 1136.50f;


