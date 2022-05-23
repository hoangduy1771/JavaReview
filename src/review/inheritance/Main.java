package review.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello inheritance");

        Car car1 = new Car("Car", "Honda", "Accord", 2022);
        car1.speed = 200;
        car1.go();
        car1.stop();
        car1.turnOnAC();
        System.out.println(car1.vehicleType);
        System.out.println(car1.speed);

        Bicycle bike1 = new Bicycle("Bicycle");
        System.out.println(bike1.vehicleType);
        bike1.autoFold();
        bike1.stop();
        System.out.println(bike1.pedal);
        System.out.println(bike1.wheels);



    }
}
