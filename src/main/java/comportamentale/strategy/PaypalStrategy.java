package comportamentale.strategy;

public class PaypalStrategy implements PaymentStrategy{

    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Email: " + emailId + " has paid: " + amount);
    }
}
