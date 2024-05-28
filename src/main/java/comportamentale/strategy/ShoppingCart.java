package comportamentale.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Obiectul a fost adaugat: " + item);
    }
    public void removeItem(Item item) {
        items.remove(item);
        System.out.println("Obiectul a fost scos: " + item);
    }
    public int calculateTotal() {
        int totalPrice = 0;
        for (Item item : items){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }

}
