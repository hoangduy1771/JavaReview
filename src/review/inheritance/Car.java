package review.inheritance;

public class Car extends Vehicle{
    int wheels = 4;
    int doors = 4;

    Car(String vehicleType, String make, String model, int year) {
        super(vehicleType);
    }

    void turnOnAC() {
        System.out.println(vehicleType + " is turning on the AC");
    }

}
