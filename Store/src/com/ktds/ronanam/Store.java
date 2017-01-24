package com.ktds.ronanam;

import com.ktds.ronanam.buyer.Buyer;
import com.ktds.ronanam.seller.Seller;

public class Store {

	public void start(){
		//		System.out.println("장터에 오신 것을 환영합니다.");
		//		//because of static 
		//		Buyer jjh = new Buyer(0,500000);
		//		Seller mjk = new Seller(100,5000000);
		//		
		//		System.out.println("buyer: 상품 좀 살게요. 이 상품 1개 주세요.");
		//		mjk.selling();
		//		jjh.buying();
		//		
		//		System.out.println("seller: 2500원 입니다.");
		//		jjh.paying(2500);
		//		
		//		System.out.println(mjk);
		//		System.out.println(jjh);

//		Buyer ljs = new Buyer(0,5000000);
//		Buyer jgu = ljs;
		//[reference type이 parameter로 전달되었을 때]
		//reference type: "주소" / 같은 memory를 참조
//		/*
//		 * 구매한 상품 갯수: 1
//		   구매자가 가진 금액:5000000
//
//		   구매한 상품 갯수: 1
//           구매자가 가진 금액:5000000
//		 */
//
//		ljs.buying();
//
//		System.out.println(ljs);
//		System.out.println(jgu);
		
		Buyer lyj = new Buyer(0,50000);
		Seller nym = new Seller(500,50000);
		//"객체"가 파라미터로 넘어감
		lyj.buying(nym); //구매자가 판매자에게 구매를한다.
		System.out.println(lyj);
		System.out.println(nym);

	}
	public static void main(String[] args){
		//		Buyer mjk = new Buyer(0, 100000);
		//		System.out.println(mjk);
		//		println() : obj.toString(); 을 호출
		//		오버라이딩 된 buyer.toString(); 호출 만약 없다면, 
		//		기본형 "주소"를 출력
		//		com.ktds.ronanam.buyer.Buyer@7dc5e7b4

		new Store().start();
	}
}
