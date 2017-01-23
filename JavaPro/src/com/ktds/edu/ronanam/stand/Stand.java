package com.ktds.edu.ronanam;

import java.io.IOException;
import java.util.Scanner;

public class Stand {
	//멤버변수
	Scanner sc = new Scanner(System.in);
	String button;
	String lamp;
	String electronicity;
	int light;
	byte menu;
	char check;

	//생성자 초기화
	public Stand() throws IOException {
		button = "switch";
		lamp = "bulb";
		electronicity = "electronicity";
		light = 0;
		input();

		check = 0;
	}

	void input() throws IOException{
		do{
			System.out.println("1.스탠드 on / 2. 스탠드 off / 3. 볼륨 up / "
					+ "4. 볼륨 down / 5. 프로그램 종료");
			menu = sc.nextByte();

			switch (menu) {
			case 1:
				on();break;
			case 2:
				off();break;
			case 3:
				if(light > 0){brightnessControlUp();}
				else{
					System.out.println("먼저, 스탠드를 키세요.");
					break;
				}
			case 4:
				if(light > 0){brightnessControlDown();}
				else{
					System.out.println("먼저, 스탠드를키세요.");
					break;
				}
			case 5: System.exit(-1);
			}
			System.out.println("계속하시려면, y/Y 누르세요.");
			check = (char)System.in.read();
			System.in.skip(2);
		}while(check == 'Y' || check == 'y');
	}

	void on(){
		System.out.printf("%s가 들어옵니다.\n", electronicity);
		System.out.println("스탠드를 켭니다.");
		light = 5;
		String message = String.format("%s를 눌러서 %s를 켭니다.", button,lamp);
		System.out.println(message);
		message = String.format("밝기는 %d입니다.", light);
		System.out.println(message);
	}

	void off(){
		System.out.printf("%s가 꺼집니다.\n", electronicity);
		System.out.println("스탠드를 끕니다.");
		light = 0;
		String message = String.format("%s를 눌러서 %s를 끕니다.", button,lamp);
		System.out.println(message);
		message = String.format("밝기는 %d입니다.", light);
		System.out.println(message);
	}

	void brightnessControlUp(){
		light ++;
		System.out.printf("밝기를 조절합니다. 밝기는 %d입니다.\n",light);
	}

	void brightnessControlDown(){
		light --;
		System.out.printf("밝기를 조절합니다. 밝기는 %d입니다.\n",light);
	}
}
