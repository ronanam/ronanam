package homework4;

import java.util.Scanner;

/**
 * [3을 입력하면 BMI를 구하는 프로그램]
 * <prev>
 * 		몸무게(kg) / (신장(m) x 신장(m))
 * </prev>
 * @author YunminNam (ronanam992@gmail.com)
 *
 */

public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게, 신장 입력 :");
		float height = sc.nextFloat();
		float weight = sc.nextFloat();
		bmi(height,weight);
		sc.close();
	}

	private static void bmi(float height, float weight) {
	
		System.out.printf("BMI 지수:%.2f", weight / ((height*0.01)*(height*0.01)));
		
	}
	
	

}
