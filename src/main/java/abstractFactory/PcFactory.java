package abstractFactory;

public class PcFactory implements ComputerAbstractFactory{

    private Integer ram;
    private Integer hardDisk;

    public PcFactory(Integer ram, Integer hardDisk) {
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    @Override
    public Computer createComputer() {
        return new Pc(ram, hardDisk);
    }
}
