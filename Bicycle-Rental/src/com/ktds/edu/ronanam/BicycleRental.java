package com.ktds.edu.ronanam;

public class BicycleRental {
	private int bicycleVolume;
	private int budget;
	private final int PRICE = 5000;
	
	

	public BicycleRental(int bicycleVolume, int budget) {
		this.bicycleVolume = bicycleVolume;
		this.budget = budget;
	}

	public int getPRICE() {
		return PRICE;
	}
	public int getBicycleVolume() {
		return bicycleVolume;
	}

	public void setBicycleVolume(int bicycleVolume) {
		this.bicycleVolume = bicycleVolume;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public void renting(Customer customer) {
		this.bicycleVolume-= customer.getRentalVolume();
		this.budget += customer.getRentalVolume() * getPRICE();
		
	}

	@Override
	public String toString(){
		String message = String.format("==============================================================\n자전거 대여점 현황\n"
				+ "--------------------------------------------------------------\n자전거 보유 수:%d\n대여료 총 합:%d\n"
				+ "==============================================================",
				this.getBicycleVolume(),this.getBudget());
		return message;
	}


}
