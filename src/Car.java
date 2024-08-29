/**
 * Class Car extends class vehicle and add new attribute brand,
 * and extra methods to perform other function
 */
public class Car extends Vehicle{

    String brand;

    //default constructor
    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //extra method hook was print hook
    public void hook(){
        System.out.println("Honk, honk!");
    }

    //extra method displayInfo prints all the attributes (including the inherited ones)
    public void displayInfo(){
        System.out.println("Number Of Wheels:"+ numberOfWheels);
        System.out.println("Color:"+ color);
        System.out.println("Engine Size:" + engineSize);
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("Brand: "+ brand);
    }
}
