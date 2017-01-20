package homework3;

/**
 * [섭씨 -> 화씨]
 * <prev>
 * 		섭씨 -> 화씨: 섭씨* 1.8 + 32 
 * </prev>
 * @author YunminNam (ronanam992@gmail.com)
 *
 */

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2를 입력하시면 프로그램 시작:");
		int start = sc.nextInt();
		
		if(start!=0){
			System.out.print("온도 입력:");
			fahrenheit(sc.nextInt());
		}
		
		sc.close();
	}


	private static void fahrenheit(int temperature) { 
		System.out.printf("섭씨 -> 화씨: %.2f",(temperature*1.8)+32); 

	}


}
