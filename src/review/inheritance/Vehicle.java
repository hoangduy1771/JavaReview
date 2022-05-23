package review.inheritance;

public abstract class Vehicle {

    double speed;
    String vehicleType;

    Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    void go() {
        System.out.println(String.format("This %s is moving", vehicleType));
    }

    void stop() {
        System.out.println(String.format("This %s stopped", vehicleType));
    }

}
