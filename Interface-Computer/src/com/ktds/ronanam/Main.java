package com.ktds.ronanam;

public class Main {

	public static void main(String[] args) {
		Computer samsungComputer = new SamsungComputer();
		samsungComputer.input();
		samsungComputer.compute();
		samsungComputer.save();
		
		//다형성: lg컴퓨터가 똑같은 일을 하지만 다른 컴퓨터
		Computer lgComputer = new LGComputer();
		lgComputer.input();
		lgComputer.compute();
		lgComputer.save();
		
//		Computer appleComputer = new AppleComputer();
//		FaceTime appleComputer = new AppleComputer(); 이렇게하면 input, compute, save를 포기해야함. 너무 큰 손실
		
		//인터페이스의 상속을 이용하자.
		
		FaceTime appleComputer = new AppleComputer();

		appleComputer.input();
		appleComputer.compute();
		appleComputer.save();
		appleComputer.faceTime(); //해결
//		faceTime 나오지 않음. 왜? 
		
		
	}

}
