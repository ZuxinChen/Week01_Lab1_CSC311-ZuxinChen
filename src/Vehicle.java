/**
 * Vehicle class with following attributes:numberOfWheels,color,engineSize and fuelType
 * which set basic information about the vehicle include constructor and setter and getter
 */


public class Vehicle {
    int numberOfWheels;
    String color;
    float engineSize;
    String fuelType;

    //default constructor set Vehicle's all attributes initial values
    public Vehicle() {
        numberOfWheels = 0;
        color = "";
        engineSize = 0;
        fuelType = "";
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
