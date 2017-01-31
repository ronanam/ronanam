

//라떼머신

package com.ktds.ronanam;

public class ChocoLatteMachine extends CoffeeMachine {

	// private int atm;

	public ChocoLatteMachine() {

		super.atm = 15; // CoffeeMachine에 있는 atm

		// atm = 15; // LatteMachine에서 만든 atm

	}

	@Override 
	public void latte() {//컴파일러가 컴파일을 하는데 빠르게 도움을 줌.

		System.out.println(atm + " 기압으로 " + "라떼를 추출합니다.");

	}

}
