package com.ktds.ronanam;

public abstract class CoffeeMachine {

	protected int atm = 9;
//	필드는 추상화 x
//	Illegal modifier for the field atm; only public, protected, private, static, final, transient & volatile are permitted
	
	
	
	public void espresso(){
		System.out.println(atm+"기압으로 에스프레소를 추출합니다.");
	}
	
	public abstract void latte(); //기능이 때에 따라 바뀔 수 있음.
	//인스턴스화 시킬 수 없다.
}
