package com.lambdaschool.cars.carssprint;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException() {
        super("Could not find Car: ");
    }
}
