package com.dl.ref.cnamespace;

public class Models {

	private String carName;
	private Double cost;
	private String generation;
	private String type;
	
	public Models() {
		
	}

	public Models(String carName, Double cost, String generation, String type) {
		super();
		this.carName = carName;
		this.cost = cost;
		this.generation = generation;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Models [carName=" + carName + ", cost=" + cost + ", generation=" + generation + ", type=" + type + "]";
	}
	
	
}
