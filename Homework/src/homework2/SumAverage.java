package homework2;

/**
 * [총합, 평균]

 * @author YunminNam (ronanam992@gmail.com)
 *
 */

import java.util.Arrays;
import java.util.Scanner;


public class SumAverage {
	int[] numbers = new int[5];
	byte num;
	
	public SumAverage() {
		//초기화
		Scanner sc = new Scanner(System.in);
		System.out.print("1을 입력하시오:");
		num = sc.nextByte();
		
		for (int i = 0; i <5 ; i++) {
			numbers[i] = (int)(Math.random()*100) +1 ;
		}
		
		if(num == 1){
			printArr();
			System.out.printf("총점: %d\n",doSum());
			doAverage();
//			num++; else로 넘어가니까 그냥 끝나버리지 멍충
		}else{
			System.out.println("잘 못된 값입니다.");
			System.exit(-1);
		}
	
		
		sc.close();
	}

	private void doAverage() {
		int sum = doSum();
		System.out.printf("평균: %.2f\n", (double)sum/5);
		
	}

	private int doSum() {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	private void printArr(){
		System.out.println("5개 수:" + Arrays.toString(numbers));
	}
}
