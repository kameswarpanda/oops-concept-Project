package com.vehicle;

public class Bus extends AbstractVehicle{

	public Bus(String brand) {
		super(brand);
	}

	@Override
	public void start() {
        System.out.println("BUS is starting.");
	}

	@Override
	public void stop() {
        System.out.println("BUS is stopping.");
	}

	@Override
	public void fuelType() {
        System.out.println("Fuel type: Disel");
	}
	
	

}
