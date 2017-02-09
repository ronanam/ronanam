package com.ktds.mcj.vo;

public class BasketVO {
	private int money;
	private int productQuantity;

	public int getMoney() {
		return money;
	}

	public void minusProductQuantity() {
		this.productQuantity--;
	}
	
	public void plusMoney(){
		this.money += money;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void plusProductQuantity() {
		this.productQuantity++;
		
	}

	public void minusMoney() {
		this.money -= money;
		
	}

}
