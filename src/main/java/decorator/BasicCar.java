package decorator;

public class BasicCar implements Car{

    private String color;
    private Integer horsePower;

    public BasicCar(String color, Integer horsePower) {
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public void assemble() {
        System.out.println("Preparing basic car: " + color + " and " + horsePower + " hp");
    }

    @Override
    public Integer changeHorsePower(Integer value) {
        return this.horsePower += value;
    }

    @Override
    public String toString() {
        return "BasicCar{" +
                "color='" + color + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
