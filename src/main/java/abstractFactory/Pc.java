package abstractFactory;

public class Pc extends Computer {

    private Integer ram;
    private Integer hardDisk;

    public Pc(Integer ram, Integer hardDisk) {
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    @Override
    public String getRam() {
        return "Ram pc: " + ram;
    }

    @Override
    public String getHardDisk() {
        return "HardDisk pc: " + hardDisk;
    }
}
