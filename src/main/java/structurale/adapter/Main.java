package structurale.adapter;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.makeNoise();

        PlasticToyDuck toyDuck = new PlasticToyDuck();
        toyDuck.squeak();

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.makeNoise();

        BirdPlasticAction toySparrow = new BirdAdapter(sparrow);
        toySparrow.squeak();
    }
}
