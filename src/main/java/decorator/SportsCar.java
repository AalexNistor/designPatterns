package decorator;

public class SportsCar extends CarDecorator{
    private Integer horsePowerToAdd;

    public SportsCar(Car car, Integer horsePowerToAdd) {
        super(car);
        this.horsePowerToAdd = horsePowerToAdd;
    }

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sports elements. New horse power: " + super.car.changeHorsePower(horsePowerToAdd));
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "horsePowerToAdd=" + horsePowerToAdd +
                '}';
    }
}
