package factory;

public class Main {
    public static void main(String[] args) {
        Pc pc = new Pc(16,250);
        System.out.println(pc.getRam());
        System.out.println(pc.getHardDisk());

        Server server = new Server(8, 125, 3);
        System.out.println(server.getRam());
        System.out.println(server.getHardDisk());

        Computer pc2 = new Pc(8,500);
        Computer server2 = new Server(8, 250, 2);

        System.out.println(pc2.getRam());
        System.out.println(server2.getRam());

        Computer server3 = ComputerFactory.createComputer("server", 15, 255);
        System.out.println(server3.getRam());
        System.out.println(server3.getHardDisk());

        Computer pc3 = ComputerFactory.createComputer("pc", 16, 200);
        System.out.println(pc3.getRam());
        System.out.println(pc3.getHardDisk());
    }
}
