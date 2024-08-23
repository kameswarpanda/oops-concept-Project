package com.vehicle;

public class OlaS1Pro extends AbstractVehicle{

	public OlaS1Pro(String brand) {
		super(brand);
	}

	@Override
	public void start() {
        System.out.println("OlaS1Pro is starting.");
	}

	@Override
	public void stop() {
        System.out.println("OlaS1Pro is stopping.");
	}

	@Override
	public void fuelType() {
        System.out.println("Fuel type: Electric Energy");
	}
	
	

}
