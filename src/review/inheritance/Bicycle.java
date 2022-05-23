package review.inheritance;

public class Bicycle extends Vehicle{

    int wheels = 2;
    int pedal = 2;


    Bicycle(String vehicleType) {
        super(vehicleType);
    }

    void autoFold() {
        System.out.println(vehicleType + " is folding automatically");
    }

}
