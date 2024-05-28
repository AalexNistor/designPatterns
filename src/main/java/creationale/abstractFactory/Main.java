package creationale.abstractFactory;

public class Main {
    public static void main(String[] args) {
        Computer server = ComputerFactory.createComputer(new ServerFactory(16, 250, 3));
        System.out.println(server.getRam());
        System.out.println(server.getHardDisk());

        Computer pc = ComputerFactory.createComputer(new PcFactory(8, 150));
        System.out.println(pc.getRam());
        System.out.println(pc.getHardDisk());
    }
}
