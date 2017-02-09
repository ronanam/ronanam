package com.ktds.edu.ronanam;
/**
 * [주유소 프로그램]
 * <prev>getter / setter를 쓰는방법</prev>
 * @author Yunmin Nam (uigte92@gmail.com)
 *
 */
//ctrl+shift+s: 간격, 정렬맞춤
public class Oilbank {
	private int oilStock;
	private int pricePerLiter;
	private int budget;
	

	public void filling(Car car) {
		this.oilStock -= car.getOilTankVolume();
		//얼마만큼 누구에게 꽉채워라
		System.out.println(this); // car
		car.fillOil(this);
		this.budget += (car.getOilTankVolume() * pricePerLiter);
	}

	public int getOilStock() {
		return oilStock;
	}

	public void setOilStock(int oilStock) {
		this.oilStock = oilStock;
	}

	public int getPricePerLiter() {
		return pricePerLiter;
	}

	public void setPricePerLiter(int pricePerLiter) {
		this.pricePerLiter = pricePerLiter;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

}
