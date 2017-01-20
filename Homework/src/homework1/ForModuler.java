package homework1;

/**
 * [% 찍기]

 * @author YunminNam (ronanam992@gmail.com)
 *
 */


public class ForModuler {

	public static void main(String[] args) {
	
		moduler();
	}

	public static void moduler(){
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <i+1; j++) {
				System.out.print("%");
			}
			System.out.println();
		}
	}
}


