package com.ktds.edu.ronanam;

public class Car {
	private String modelName;
	private int oilTankVolume;
	private int oilStock;
	private int money;

	public Car(String modelName, int oilTankVolume, int money) {

		this.modelName = modelName;
		this.oilTankVolume = oilTankVolume;
		this.money = money;
		oilStock = 0;
	}

	// alt + shift + s , alt + s + r: getter / setter
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getOilTankVolume() {
		return oilTankVolume;
	}

	public void setOilTankVolume(int oilTankVolume) {
		this.oilTankVolume = oilTankVolume;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getOilStock() {
		return oilStock;
	}

	public void setOilStock(int oilStock) {
		this.oilStock = oilStock;
	}

	public void fillOil(Oilbank oilbank) {
		//가정: "무조건 꽉 채운다"
		oilStock = oilTankVolume;
		//(): 보기 편하라고
		this.money -= (oilTankVolume * oilbank.getPricePerLiter());
	}

}
