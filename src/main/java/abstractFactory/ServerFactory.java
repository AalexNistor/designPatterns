package abstractFactory;

public class ServerFactory implements ComputerAbstractFactory{

    private Integer ram;
    private Integer hardDisk;
    private Integer numberOfComponents;

    public ServerFactory(Integer ram, Integer hardDisk, Integer numberOfComponents) {
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.numberOfComponents = numberOfComponents;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hardDisk, numberOfComponents);
    }
}
