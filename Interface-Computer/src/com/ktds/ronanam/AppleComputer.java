package com.ktds.ronanam;

public class AppleComputer implements FaceTime{
//	public class AppleComputer implements Computer, FaceTime{  faceTime이 computer를 이미 상속받기 때문에

	@Override
	public void input() {
		System.out.println("Mac keyboard로 입력합니다.");

	}

	@Override
	public void compute() {
		System.out.println("Apple CPU를 사용해 계산합니다.");

	}

	@Override
	public void save() {
		System.out.println("Samsung SSD에 저장합니다.");

	}

	
	//하지만, 여전히 main에서 호출 x
	@Override
	public void faceTime() {
		System.out.println("camera로 영상통화를 합니다.");
		
	}
	
	//이렇게 정의해주면 main에서 어차피 호출 x 인터페이스니까~
//	public void faceTime(){
//		System.out.println("camera로 영상통화를 합니다.");
//	}
	
	//인터페이스의 다중상속을 이용

}
