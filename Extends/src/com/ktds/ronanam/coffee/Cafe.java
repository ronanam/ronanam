package com.ktds.ronanam.coffee;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine espressoMachine = new CoffeeMachine();
		espressoMachine.espresso();

		
		System.out.println("=================라떼머신=================");
		LatteMachine latteMachine = new LatteMachine();
		/**
		 * sub class is a super class 나중에 배울 것! 
		 * CoffeeMachine latteMachine2 = new LatteMachine(); 
		 * latteMachine2.latte();
		 * coffeeMachine에서는 latte를 추출하는 메소드가 x
		 */

		latteMachine.latte();
		latteMachine.espresso();

	}

}
