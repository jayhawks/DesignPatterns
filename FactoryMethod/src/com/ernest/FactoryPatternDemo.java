package com.ernest;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        AutomobileFactory factory = new AutomobileFactory();

        // Get instance of a sedan
        Automobile sedan = factory.getAutomobile("sedan");

        // Get instance of a truck
        Automobile truck = factory.getAutomobile("truck");

        // Get instance of an electric car
        Automobile electric = factory.getAutomobile("electric");


        // Call methods on Automobiles
        System.out.println("Starting sedan");
        sedan.startEngine();

        System.out.println("Starting truck");
        truck.startEngine();

        System.out.println("Starting electric");
        electric.startEngine();

        System.out.println("Fuel electric");
        electric.fuelUp();

        System.out.println("Fuel truck");
        truck.fuelUp();

        System.out.println("Fuel sedan");
        sedan.fuelUp();


    }
}
