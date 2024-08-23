package com.vehicle;

public class Car extends AbstractVehicle{

	public Car(String brand) {
		super(brand);
	}

	@Override
	public void start() {
        System.out.println("Car is starting.");
	}

	@Override
	public void stop() {
        System.out.println("Car is stopping.");
	}

	@Override
	public void fuelType() {
        System.out.println("Fuel type: Petrol");
	}
	
	

}
