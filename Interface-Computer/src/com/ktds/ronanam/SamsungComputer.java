package com.ktds.ronanam;

public class SamsungComputer implements Computer{
	//모든게 추상적이기 때문에 extends가지고는 x implements keyword 사용하기.
	@Override
	public void input() {
		System.out.println("키보드와 마우스로 입력을 합니다.");
		
	}

	@Override
	public void compute() {
		System.out.println("Intel 7세대 CPU i7을 사용해 계산합니다.");
		
	}

	@Override
	public void save() {
		System.out.println("SSD에 저장합니다.");
		
	}
	
	

	
	
}
