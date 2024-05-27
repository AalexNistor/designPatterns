package observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Channel {
    private String channelName;
    private List<Subscriber> subscribers = new ArrayList<>();
//    private HashMap<Subscriber, LocalDate> subscriberDate;

    public Channel(String channelName) {
        this.channelName = channelName;
//        this.subscribers = new ArrayList<>();
    }

    public void registerSubscriber(Subscriber subscriber) {
        subscriber.setSubTime(LocalDate.now());
        subscribers.add(subscriber);
        System.out.println("Sub " + subscriber + " has been added.");
    }

    public void notify(String message){
//        for(int i = 0; i < subscribers.size(); i++){
//            subscribers.get(i).receiveMessage(message);
//        }
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveMessage(message);
        }
    }

    public void notifyOld(String message, int time){
//        for(int i = 0; i < subscribers.size(); i++){
//            subscribers.get(i).receiveMessage(message);
//        }
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getSubTime().getYear() > time)
            subscriber.receiveMessage(message);
        }
    }
}
