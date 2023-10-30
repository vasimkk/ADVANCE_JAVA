package com.dl.nodependency;

public class Client {

	public static void main(String[] args) {
		
		Brand bike = new Bike();
		System.out.println(bike.Honda());
		
		Brand car =  new Car();
		System.out.println(car.Honda());
	}
}

