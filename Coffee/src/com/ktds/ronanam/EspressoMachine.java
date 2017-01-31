package com.ktds.ronanam;

public abstract class EspressoMachine extends CoffeeMachine{
	@Override
	public void latte() {
		//녹색: 재정의(이미 구현이 되어있는 것을)
		//하얀색: 내가 지금 처음으로 구현하는 것이다.(추상적인 것을)
		System.out.println("???");
	}
	
	
	

}
