package com.vehicle;

public class VehicleDemo {

	public static void main (String [] args) {
		Car car = new Car("Toyota");
		Bike bike = new Bike("Pulsur");
		Bus bus = new Bus("TATA");
		OlaS1Pro s1Pro = new OlaS1Pro("S1 Pro");
		
		FinalVehicleUtil util = new FinalVehicleUtil();
		
		util.printViehicleDetails(car);
		System.out.println();
		util.printViehicleDetails(bike);
		System.out.println();
		util.printViehicleDetails(bus);
		
		System.out.println();
		util.printViehicleDetails(s1Pro);
 	}
}
