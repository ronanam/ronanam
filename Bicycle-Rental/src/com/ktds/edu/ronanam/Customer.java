package com.ktds.edu.ronanam;

public class Customer {

	private int money;
	private int bicycleVolume;
	private int rentalVolume;

	public Customer(int money, int rentalVolume) {

		this.money = money;
		this.rentalVolume = rentalVolume;
	}

	public int getRentalVolume() {
		return rentalVolume;
	}

	public void setRentalVolume(int rentalVolume) {
		this.rentalVolume = rentalVolume;
	}

	public int getBicycleVolume() {
		return bicycleVolume;
	}

	public void setBicycleVolume(int bicycleVolume) {
		this.bicycleVolume = bicycleVolume;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void doRent(BicycleRental bicyclerental) {
		bicycleVolume += getRentalVolume();
		money -= bicyclerental.getPRICE() * getRentalVolume();
		bicyclerental.renting(this);
	}
	
	@Override
	public String toString(){
		String message = String.format("==============================================================\n대여자 현황\n"
				+ "--------------------------------------------------------------\n자전거 보유 수:%d\n보유 금액:%d\n"
				+ "==============================================================",
				this.getBicycleVolume(),this.getMoney());
		return message;
	}

}
