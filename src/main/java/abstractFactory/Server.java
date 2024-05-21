package abstractFactory;

public class Server extends Computer {


    private Integer ramPerComp;
    private Integer hddPerComponent;
    private Integer numberOfComp;

    public Server(Integer ramPerComp, Integer hddPerComponent, Integer numberOfComp) {
        this.ramPerComp = ramPerComp;
        this.hddPerComponent = hddPerComponent;
        this.numberOfComp = numberOfComp;
    }

    @Override
    public String getRam() {
        return "Ram server: " + ramPerComp * numberOfComp;
    }

    @Override
    public String getHardDisk() {
        return "Hard disk server: " + hddPerComponent * numberOfComp;
    }
}
