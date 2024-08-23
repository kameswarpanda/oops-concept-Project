package com.vehicle;

public class Bike extends AbstractVehicle{

	public Bike(String brand) {
		super(brand);
	}

	@Override
	public void start() {
        System.out.println("Bike is starting.");		
	}

	@Override
	public void stop() {
        System.out.println("Bike is stoping.");		
	}

	@Override
	public void fuelType() {
        System.out.println("Fuel type: Petrol");		
	}

}
