package creationale.factory;

import java.util.Scanner;

public class ComputerFactory {

    public static Computer createComputer(String computerType, Integer ram, Integer hardDisk){
        if("PC".equals(computerType.toUpperCase())){
            return new Pc(ram,hardDisk);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti nr de componente: ");
            Integer numberOfComponents = scanner.nextInt();
            return new Server(ram, hardDisk,numberOfComponents);
        }
    }
}
