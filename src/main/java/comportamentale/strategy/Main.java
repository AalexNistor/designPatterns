package comportamentale.strategy;

public class Main {
    public static void main(String[] args) {
        Item milk = new Item("CodDeBareLapte", 4);
        Item oua = new Item("CodDeBareOua", 1);
        Item tesla = new Item("CodDeBareTesla", 599);
        Item punga = new Item("CodDeBarePunga", 1);
        Item cola = new Item("CodDeBareCola", 6);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(milk);
        shoppingCart.addItem(oua);
        shoppingCart.addItem(tesla);
        shoppingCart.addItem(punga);
        shoppingCart.addItem(cola);

        CreditCardStrategy edenRed = new CreditCardStrategy("CardDeBonuri", "5334-5555-9239-1234", "021", "2025-12-01");
        PaypalStrategy masterPay = new PaypalStrategy("eulamine@com.com", "parolasmechera");

        shoppingCart.pay(edenRed);

        shoppingCart.removeItem(tesla);

        shoppingCart.pay(masterPay);

    }
}
