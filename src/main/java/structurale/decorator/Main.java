package structurale.decorator;

public class Main {
    public static void main(String[] args) {
        BasicCar car1 = new BasicCar("red", 100);
//        car1.assemble();

        Car luxuryCar = new LuxuryCar(car1, true);
        luxuryCar.assemble();

        Car sportsLuxuryCar = new SportsCar(luxuryCar);
//        sportsLuxuryCar.assemble();

        Car sportCar = new SportsCar(car1, 200);
        sportCar.assemble();
    }
}
