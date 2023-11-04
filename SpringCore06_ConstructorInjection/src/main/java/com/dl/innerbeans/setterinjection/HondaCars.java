package com.dl.innerbeans.setterinjection;

public class HondaCars {

	private String carModels;
	
	public HondaCars() {
	}

	public HondaCars(String carModels) {
		super();
		this.carModels = carModels;
	}

	public String getCarModels() {
		return carModels;
	}

	public void setCarModels(String carModels) {
		this.carModels = carModels;
	}

	@Override
	public String toString() {
		return "HondaCars [carModels=" + carModels + "]";
	}
	
}

