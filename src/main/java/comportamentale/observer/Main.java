package comportamentale.observer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber("Robert");
        Channel channel1 = new Channel("Canalul 1");
        channel1.registerSubscriber(sub1);

        Subscriber sub2 = new Subscriber("Maria");
        channel1.registerSubscriber(sub2);

        channel1.notify("Haide in parc");
        System.out.println(sub1.getSubTime());
        sub2.setSubTime(LocalDate.of(2001, 12, 20));
        channel1.notifyOld("Bine ai venit", 2000);

        System.out.println("TEST HASHMAP");

        ChannelHashMap channel2 = new ChannelHashMap("Canal 2");
        channel2.registerSubscriber(sub1);
        channel2.notifyOldSubHashMap("hai la fotbal", 2020);

    }
}
