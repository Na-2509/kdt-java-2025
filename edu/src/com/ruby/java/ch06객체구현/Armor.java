package com.ruby.java.ch06객체구현;

class Armor {
	private String name;
	int height;

	public String getName() { //getter - 게터라고 부름
		return name;
	}

	public void setName(String value) { //setter - 세터라고 부름
		name = value;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int value) {
		height = value;
	}
}