package builder;

public class Coffee {

    private String coffeeType;
    private boolean milk;
    private boolean sugar;
    private CoffeeSizes size;

    private Coffee(String coffeeType, boolean milk, boolean sugar, CoffeeSizes size) {
        this.coffeeType = coffeeType;
        this.milk = milk;
        this.sugar = sugar;
        this.size = size;
    }

    public static class CoffeeBuilder {
        private String coffeeType;
        private boolean milk;
        private boolean sugar;
        private CoffeeSizes size;

        public CoffeeBuilder setCoffeeType(String coffeeType) {
            this.coffeeType = coffeeType;
            return this;
        }

        public CoffeeBuilder setMilk(boolean milk) {
            this.milk = milk;
            return this;
        }

        public CoffeeBuilder setSugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public CoffeeBuilder setSize(CoffeeSizes size) {
            this.size = size;
            return this;
        }

        public Coffee build() {
            return new Coffee(this.coffeeType, this.milk, this.sugar, this.size);
        }
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeType='" + coffeeType + '\'' +
                ", milk=" + milk +
                ", sugar=" + sugar +
                ", size=" + size +
                '}';
    }
}
