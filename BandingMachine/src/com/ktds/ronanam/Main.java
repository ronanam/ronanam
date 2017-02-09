package com.ktds.ronanam;

import java.io.IOException;
import java.util.Scanner;

import com.ktds.ronanam.buyer.Buyer;
import com.ktds.ronanam.machine.Machine;

public class Main {
	Scanner sc = new Scanner(System.in);
	private byte menu;
	Buyer buyer = new Buyer();
	Machine machine = new Machine();
	private char check;

	public void start() throws IOException{
		do {
			System.out.println("자판기 프로그램 시작.");
			System.out.println("1. 콜라 / 2. 사이다 / 3. 환타");
			menu = sc.nextByte();

			if(menu == 1 || menu ==2 || menu == 3){
				buyer.buy(machine,menu); //자판기에서 물건을 구매
			}else{
				System.out.println("잘못된 메뉴를 선택. 프로그램 종료");
				break;
			}

			System.out.println("=======구매 후=======");
			System.out.println(buyer);
			System.out.println(machine);

			System.out.println("계속하시려면 y/Y 누르세요...");
			check = (char)System.in.read();
			System.in.skip(2);


		} while (check == 'y' || check == 'Y');

		if(check != 'y' || check != 'Y'){
			System.out.println("프로그램 종료");
			System.exit(-1);
		}
		sc.close();
	}
	public static void main(String[] args) throws IOException {

		new Main().start();
	}

}
