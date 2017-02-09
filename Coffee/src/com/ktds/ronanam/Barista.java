package com.ktds.ronanam;

public class Barista {

	public void coffee(CoffeeMachine coffeeMachine) {

//		if (coffeeMachine instanceof CoffeeMachine) {
//
//			coffeeMachine.espresso();
//
//		} else if (coffeeMachine instanceof LatteMachine) {
//
//			coffeeMachine.espresso();
//
//			((LatteMachine) coffeeMachine).latte();
//
//		}
		
		coffeeMachine.espresso();
		coffeeMachine.latte();

	}

}