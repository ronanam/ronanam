package com.ktds.ronanam.buyer;

import com.ktds.ronanam.seller.Seller;

/**
 * seller에게 상품을 구매하고 금액을 seller에게 지불한다.
 * @author Yunmin Nam (ronanam992@gmail.com)
 *
 */
public class Buyer {
	/**
	 * 상품 갯수
	 */
	private int productQuantity;
	
	/**
	 * 구매자가 가진 금액
	 */
	private int money;

	/**
	 * 생성자
	 */
	public Buyer(int productQuantity, int money) {
		//생성자의 위치는 멤버변수 바로 밑
		System.out.println("구매자를 생성합니다.");
		//초기값 setting
		setProductQuantity(productQuantity);
		setMoney(money);
		
		//현황 출력
		System.out.println(this);
		//오버라이딩 한 toString()을 호출
	}
	
	/**
	 * 상품 갯수를 반환함(출력 용)
	 * @return
	 */
	public int getProductQuantity() {
		return this.productQuantity;
	}

	/**
	 * 상품 갯수를 초기화 or 갱신
	 * @param productQuantity
	 */
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	/**
	 * 구매자가 가진 돈을 반환함(출력 용)
	 * @return
	 */
	public int getMoney() {
		return this.money;
	}

	/**
	 * 구매자의 가진 돈을 초기화 or 갱신
	 * @param money
	 */
	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * 구매하기
	 * 구매자가 가진 상품 갯수에 1 증가
	 */
	public void buying(Seller seller){
		//메모리 주소를 넘긴다. 객체를 넘긴다는 뜻 x
		//seller.selling()을 호출한 "lyj"을 넘긴다.
		seller.selling(this); //판매자가 sell
		
		this.productQuantity ++ ;
	}

	/**
	 * 지불하기
	 * 구매자가 가진 돈에서 지불할 돈을 뺀다.
	 */
	public void paying(int money){
		this.money -= money;
	}
	
	/**
	 * 구매자 현황 파악하기
	 */
	public String toString(){
		String message = 
				String.format("구매한 상품 갯수: %d\n구매자가 가진 금액:%d\n", this.productQuantity,
				this.money);
		return message;
	}
	
	
	
	
	
	
	
}
