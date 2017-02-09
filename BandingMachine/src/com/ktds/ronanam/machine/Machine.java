package com.ktds.ronanam.machine;

import com.ktds.ronanam.buyer.Buyer;

public class Machine {
	private int money;
	private int[] productQuantity = new int[3];
	private final int[] PRICE = new int[3];
	
	public Machine() {
		for (int i = 0; i < productQuantity.length; i++) {
			productQuantity[i] = 100;
		}
		PRICE[0] = 1500;
		PRICE[1] = 2000;
		PRICE[2] = 2500;
	
		money = 5000000;

	}

	public void sell(Buyer buyer, Byte menu) {
		buyer.pay(PRICE[menu-1]);
		//가격 증가
		this.money += PRICE[menu-1];
		//수량 1 감소
		productQuantity[menu-1] --;
	}
	
	@Override
	public String toString(){
		String message = String.format("자판기금액:%d\n콜라수량:%d\t사이다수량:%d\t,환타수량:%d\n",
				this.money,this.productQuantity[0],this.productQuantity[1],this.productQuantity[2]);
		return message;
	}
}
