package com.ktds.ronanam.coffee;

public class CoffeeMachine {
	protected int atm;
	
	public CoffeeMachine() {
		setAtm(9);
	}
	public int getAtm() {
		return atm;
	}


	public void setAtm(int atm) {
		this.atm = atm;
	}


	public void espresso(){
		System.out.println(atm+"기압으로 espresso를 추출합니다.");
	}
	




}

