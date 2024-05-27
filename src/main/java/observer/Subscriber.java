package observer;

import java.time.LocalDate;

public class Subscriber {
    private String name;
    private LocalDate subTime;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getSubTime() {
        return subTime;
    }

    public void setSubTime(LocalDate subTime) {
        this.subTime = subTime;
    }

    public void receiveMessage(String message) {
        System.out.println(name + " has receive: " + message);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                '}';
    }
}
