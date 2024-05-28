package comportamentale.strategy;

import java.time.LocalDate;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        String[] parseDate = dateOfExpiry.split("-");
        if (LocalDate.now().isBefore(LocalDate.of(Integer.parseInt(parseDate[0]),Integer.parseInt(parseDate[1]),Integer.parseInt(parseDate[2])))) {
            System.out.println("Card number " + cardNumber + " has paid " + amount + " User:" + name);
        } else {
            System.out.println("Card expired");
        }
    }
}
