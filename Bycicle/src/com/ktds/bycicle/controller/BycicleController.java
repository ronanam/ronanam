package com.ktds.bycicle.controller;

import java.util.Scanner;

import com.ktds.bycicle.biz.BycicleBiz;
import com.ktds.bycicle.biz.BycicleBizImpl;

public class BycicleController {
	public void start() {
		Scanner sc = new Scanner(System.in);
		BycicleBiz byciclebiz = new BycicleBizImpl(); // 주의
		byte menu = 0;
		int time = 0;

		while (true) {
			System.out.println("============자전거 대여============");
			System.out.println("1.고급/ 2.중급 / 3. 초급");
			menu = sc.nextByte();
			if (menu != 1 && menu != 2 && menu != 3) {
				break;
			}
			byciclebiz.transaction(menu);

			System.out.println("반납해주세요.");
			System.out.print("대여 시간 입력:");
			time = sc.nextInt();
			byciclebiz.back(menu, time);

		}
		sc.close();
	}

	public static void main(String[] args) {
		new BycicleController().start();
	}

}
