package com.ernest;

/**
 * Created by james on 5/1/15.
 */
public class ElectricCar implements Automobile {

    public ElectricCar() {

    }

    @Override
    public void startEngine() {
        System.out.println("*no sound*");
    }

    @Override
    public void fuelUp() {
        System.out.println("Batteries have been recharged!");
    }
}
