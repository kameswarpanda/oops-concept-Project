package com.vehicle;

public abstract class AbstractVehicle implements Vehicle {
    protected String brand;

     public AbstractVehicle(String brand) {
        this.brand = brand;
    }

    public abstract void fuelType();

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
