package com.ktds.ronanam.buyer;

import com.ktds.ronanam.machine.Machine;

public class Buyer {
	private int money;
	//0: 콜라 / 1: 사이다 / 2: 환타
	private int[] productQuantity = new int[3];


	//생성자
	public Buyer() {
		//모든 음료의 수량 100 초기화
		for (int i = 0; i < productQuantity.length; i++) {
			productQuantity[i] = 0;
		}
		
		money = 50000;
	}
	
	


	public void pay(int money){
		this.money -= money;
	}


	public void buy(Machine machine, byte menu) {
		// 잔액을 감소
		machine.sell(this,menu);
		//수량을 증가
		productQuantity[menu-1]++;
		
	}
	
	@Override
	public String toString(){
		String message = String.format("손님금액: %d\n콜라:%d\t사이다:%d\t환타:%d\n", 
				this.money,this.productQuantity[0],this.productQuantity[1],this.productQuantity[2]);
		return message;
	}

}
