package com.ruby.java.ch06객체구현;

class Armor { // Armor 선언하면서 아래 접근제한자를 public으로 설정함(생략가능, 다른 패키지에서는 못읽도록 일부러, 붙으면 다른패키지도 읽을 수 있게됨) <--Armor 클래스를 어디서나 가져다 쓸 수 있게 공개한 것
	private String name; // 접근제한자(이름) <-- 현재클래스 내부에서만 접근가능(=Armor 클래스 외부에서는 접근 불가상태의 필드영역)
	private int height; //접근제한자(키) <-- 자바 : 클래스의 필드명을 비공개 선언이 일반적(private), 정보보호. 단, 게터/세터 사용해서 개발자가 의도하는 검증된 접근만 가능하게 할 수 있음

	public String getName() { //getter - 게터라고 부름
		//getName() 메서드 public으로 선언됨 
		//--> return문 사용으로 Armor클래스의 name필드를 반환하고, 
		//반환할 name필드 타입이 String이므로 
		//--> 메서드선언할때 반환타입을 String으로 선언함
		//name필드 접근제한자(private)이니까, 여기서 접근할 수 없음
		//외부에 있는 name필드 사용하려면 getName()메서드처럼 필드값 반환하는 메서드가 필요함
		//private선언된 필드값을 반환하는 메서드 <-- getter라 부르고, 메서드 이름을 "get"으로 시작함
		return name;
	}

	public void setName(String value) { //setter - 세터라고 부름 <--private로 선언된 필드에 데이터를 설정하는 메서드
		//setName()메서드도 public으로 선언됨 <-- 어디서나 사용가능 + 반환값은 없음(=void)
		//setName()메서드의 매개변수로 String타입의 value를 선언함
		//매개변수 value에서 메서드를 호출하면서 함께 전달하는 인자값이 저장죔
		//setName()메서드의 본문(실행문)에서 이 값을 Armor클래스의 name필드에 저장함
		name = value;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int value) {
		height = value;
	}
}