/**
 * Lab Work - Week01: Create a Vehicle Class and a Child Class called Car in Java
 * Objective:
 * Create a Vehicle class with certain attributes.
 * Extend the Vehicle class by creating a Car class with additional attributes and methods.
 * Use either IntelliJ IDEA or NetBeans for your IDE.
 * Push the final code to GitHub.
 * Submit the GitHub URL on Brightspace.
 */

public class Main {
    public static void main(String[] args) {
        testVehicle();
        testCar();
    }

    //test Vehicle class
    public static void testVehicle(){
        Vehicle v = new Vehicle();

        //test defuel constructor information are correct
        System.out.println("Test defuel constructor");
        System.out.println(v.getNumberOfWheels());
        System.out.println(v.getColor());
        System.out.println(v.getEngineSize());
        System.out.println(v.getFuelType());

        //tests setter and getter was work
        System.out.println("Test setter and getter");
        v.setNumberOfWheels(4);
        v.setColor("white");
        v.setEngineSize(15);
        v.setFuelType("coal oil");
        System.out.println(v.getNumberOfWheels());
        System.out.println(v.getColor());
        System.out.println(v.getEngineSize());
        System.out.println(v.getFuelType());
    }

    //tests Car class
    public static void testCar(){
        Car c = new Car();

        //test two extra method hook and displayInfo
        // these are defuel value
        System.out.println("------------");
        System.out.println("Test extra methods");
        c.hook();
        c.displayInfo();

        //test value change is working
        System.out.println("------------");
        System.out.println("Test value change");
        c.setNumberOfWheels(6);
        c.setColor("black");
        c.setEngineSize(20);
        c.setFuelType("diesel fuel");
        c.setBrand("SUV");
        c.displayInfo();

    }
}