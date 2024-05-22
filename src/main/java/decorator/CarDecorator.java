package decorator;

public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }

    @Override
    public Integer changeHorsePower(Integer value) {
        return this.car.changeHorsePower(value);
    }
}
