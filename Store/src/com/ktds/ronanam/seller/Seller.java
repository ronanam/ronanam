package com.ktds.ronanam.seller;

import com.ktds.ronanam.buyer.Buyer;

public class Seller {
	/**
	 * 판매자가 가진 금액
	 */
	private int money;
	/**
	 * 재고
	 */
	private int productquantity;
	/**
	 * 상품 가격
	 */
	private final int PRICE = 2500; //상수는 초기화 바로!, 상수에대해서는 getter/setter x

	public Seller(int productQuantity, int money) {
//		[멤버변수의 final은 생성자에서 무조건 초기화되어야한다.]
//		The blank final field PRICE may not have been initialized
//		PRICE = 10;
//		final int price; 지역변수는 가능
		System.out.println("판매자를 생성합니다.");
		setMoney(money);
		setProductquantity(productQuantity);
		System.out.println(this);
	}
	
	public int getMoney() {
		return this.money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public int getProductquantity() {
		return productquantity;
	}



	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}



	public void selling(Buyer buyer){
		//판매자가 가진 상품의 갯수에서 하나를 뺀다.
		this.productquantity--;
		//구매자는 돈을 지불한다.
		buyer.paying(PRICE);
		//판매자가 가진 금액에서 상품의 가격만큼 더한다.
		this.money += PRICE;
	}
	
	/**
	 * 재고 파악하기
	 * @return: boolean 재고가 있으면 false, 재고가 없으면 true
	 */
	public boolean isSoldOut(){
		boolean isSoldOut = this.productquantity == 0;
		return isSoldOut;
	}

	
	/**
	 * 판매자 현황 파악하기
	 */
	@Override
	public String toString(){
		String message = String.format("판매자의 상품 갯수: %d\n판매자가 가진 금액: %d\n",
				this.productquantity,this.money);
		return message;
	}
	

}
