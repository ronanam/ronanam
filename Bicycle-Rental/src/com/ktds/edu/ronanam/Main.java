package com.ktds.edu.ronanam;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	private Scanner sc = new Scanner(System.in);
	private int rentalVolume;
	private char check;
	

	//문제: 이어지지 않음 계속 수량이 깍여야함
	public void start() throws IOException {
		while (true) {
			System.out.println("어서오세요. 자전거 대여소입니다. \n렌트할 자전거의 수를 입력하세요:");
			rentalVolume = sc.nextInt();
			if (rentalVolume > 0 && rentalVolume <= 100) {
				Customer customer = new Customer(100000, rentalVolume);
				BicycleRental bicyclerental = new BicycleRental(100, 200000);
				customer.doRent(bicyclerental);
				System.out.println(bicyclerental + "\n");
				System.out.println(customer);
			} else {
				System.out.println("입력오류: 대여소에 있는 자전거의 수는 100개입니다.");
			}

			System.out.println("계속 하시려면 아무키나 종료하시려면 n/N");
			check = (char) System.in.read();
			System.in.skip(2);
			
			if (check == 'n' || check == 'N') {
				System.out.println("대여완료: 프로그램 종료");
				break;
			}
		}

	}

	public static void main(String[] args) throws IOException {
		new Main().start();
	}

}
