package com.vehicle;

public final class FinalVehicleUtil {
	public final void printViehicleDetails(AbstractVehicle vehicle) {

		vehicle.displayBrand();
		vehicle.fuelType();
		vehicle.start();
		vehicle.stop();
	}
}
