package com.ktds.ronanam;

public class AirConditioner extends AirCleaner{
	
	/**
	 * 냉방 설정 온도
	 */
	private int temp;
	
	public AirConditioner() {
		setTemp(26);
	}
	
	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}


	/**
	 * 전원 on
	 */
	
	@Override
	public void powerOn(){
		System.out.println("에어컨을 켭니다.");
		System.out.println("시원해 집니다.");
		
		cooling();
		System.out.println("공기청정기 제조사:" + super.manufactor);
		System.out.println("공기청정기 제조국가:"+super.origin);
		super.powerOn();
	}
	
	/**
	 * 온도 down
	 */
	public void cooling(){
		temp--;
		System.out.printf("현재 설정온도:%d\n",temp);
	}
	

}
