package com.ktds.ronanam;

public class ExtendsTest {
	
	public void start(){
		String str = "Extends Test...";
		String str1 = new String("Extends Test...");
		Object obj = new String(str); //문자열을 만드는 방법, Object는 무엇이든 될 수 있는 class
		System.out.println(obj);
	}
	
	public static void main(String[] args){
//		new ExtendsTest().start();
		
		ExtendsTest extendsTest = new ExtendsTest();
		extendsTest.start();
		extendsTest.equals("");
		//public, protected(상속 관계에서만 쓰일 수 있는 접근지시 제어자)
	}
}
