package com.ktds.edu.ronanam;

public class Main {

	public void start(){
		Oilbank oilbank = new Oilbank();
		Car car = new Car("무쏘", 50, 10000000);
		oilbank.setOilStock(5000);
		oilbank.setPricePerLiter(1480);
		oilbank.setBudget(0);
		
		
		
		//가득 채움을 전제
		oilbank.filling(car);
		System.out.println(oilbank); // car: Oilbank.class의 18번째 줄과 같은 객체
		
		System.out.println("=========주유소=========");
		System.out.println(oilbank.getOilStock());
		System.out.println(oilbank.getBudget());
		System.out.println("=========자동차=========");
		System.out.println(car.getModelName());
		System.out.println(car.getOilTankVolume());
		System.out.println(car.getOilStock());
		System.out.println(car.getMoney());
		
	}
	public static void main(String[] args) {
		
		new Main().start();

	}

}
