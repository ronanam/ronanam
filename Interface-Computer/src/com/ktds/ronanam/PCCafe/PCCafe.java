package com.ktds.ronanam.PCCafe;

import com.ktds.ronanam.AppleComputer;
import com.ktds.ronanam.Computer;
import com.ktds.ronanam.LGComputer;
import com.ktds.ronanam.SamsungComputer;

/**
 * 다형성: 하나의 인터페이스로 여러개의 클래스를 만들 수 있다.
 * 인터페이스는 객체로 사용할 수 있다.
 */
public class PCCafe {

	public static void main(String[] args) {
		Computer[] computers = new Computer[5];
		
		computers[0] = new SamsungComputer();
		computers[1] = new LGComputer();
		computers[2] = new SamsungComputer();
		computers[3] = new AppleComputer();
		computers[4] = new LGComputer();
		
		for (Computer computer : computers) {
			computer.input();
			computer.compute();
			computer.save();
			if(computer instanceof AppleComputer){
				((AppleComputer) computer).faceTime();
			}
		}

	}

}
