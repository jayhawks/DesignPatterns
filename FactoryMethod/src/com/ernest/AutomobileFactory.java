package com.ernest;

/**
 * Created by james on 5/1/15.
 */
public class AutomobileFactory {

    public AutomobileFactory() {

    }

    public Automobile getAutomobile(String type) {

        if (type.equalsIgnoreCase("sedan")) {
            return new SedanCar();
        } else if (type.equalsIgnoreCase("truck")) {
            return new DieselTruck();
        } else if (type.equalsIgnoreCase("electric")) {
            return new ElectricCar();
        }


        return null;
    }

}
