package com.ernest;

/**
 * Created by james on 5/1/15.
 */
public class SedanCar implements Automobile {

    public SedanCar() {

    }

    @Override
    public void startEngine() {
        System.out.println("*Sedan engine sounds*");
    }

    @Override
    public void fuelUp() {
        System.out.println("Sedan tank filled up with gasoline");
    }
}
