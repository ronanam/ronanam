package com.ktds.ronanam.coffee;

/**
 * 실무에서는 상속을 알아 볼 수 있을 정도로만 해두면 된다.
 */
public class LatteMachine extends CoffeeMachine{

//	private int atm;
	public LatteMachine() {
//		setAtm(15);
		super.atm = 15;
//		atm = 15; 의미 x
	}
	public void latte(){
		System.out.println(super.atm+"기압으로 latte를 추출합니다.");
	}
}
