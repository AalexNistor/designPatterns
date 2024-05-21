package builder;

public class Main {
    public static void main(String[] args) {
        Coffee coffeeLatte = new Coffee
                .CoffeeBuilder()
                .setCoffeeType("Latte")
                .setSugar(true)
                .build();
        System.out.println(coffeeLatte);
    }
}
