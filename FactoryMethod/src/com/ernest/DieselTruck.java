package com.ernest;

/**
 * Created by james on 5/1/15.
 */
public class DieselTruck implements Automobile {

    public DieselTruck() {

    }

    @Override
    public void startEngine() {
        System.out.println("*Loud diesel engine sounds*");

    }

    @Override
    public void fuelUp() {
        System.out.println("Tank filled up with Diesel");
    }
}
