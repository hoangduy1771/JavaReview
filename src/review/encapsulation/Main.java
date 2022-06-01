package review.encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Hybrid", "BMW", 2022);
        System.out.println(car.getYear());

        car.setMake("Coupe");
        System.out.println(car.getMake());
    }

}
