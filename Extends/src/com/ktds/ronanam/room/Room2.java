package com.ktds.ronanam.room;

import com.ktds.ronanam.AirCleaner;
import com.ktds.ronanam.AirConditioner;

public class Room2 {

	public static void main(String[] args) {
		AirCleaner airCleaner = new AirConditioner(); // sub class is a super
														// class (서브클래스가 슈퍼클래스에
														// 할당이 될 수 있다.)
		
		
		/*
		 * super.powerOn(); 을 쓰지 않으면, 메소드 오버라이딩으로 airConditioner에 있는 powerOn()을
		 * 호출한다. [결과] 에어컨을 켭니다. 시원해 집니다. 현재 설정온도:25
		 */
		airCleaner.powerOn();
		
		//protected: 동일 패키지 내에서만 접근 가능(default, public, protected 상속 지원 o)
		//private: 아무리 상속 관계여도 지원 x
		
//		public String manufactor = "휘센";
//		protected String origin = "한국";
//		private int power = 3;

	

	}

}
