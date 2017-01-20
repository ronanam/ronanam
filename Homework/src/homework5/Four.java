package homework5;

/**
 * [4누르면 프로그램 종료]
 * @author YunminNam (ronanam992@gmail.com)
 *
 */

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램을 종료하려면 4를 입력하시오:");
		
		if(sc.nextByte() == 4) System.out.println("============종료 완료============");System.exit(-1);
		sc.close();
	}

}
