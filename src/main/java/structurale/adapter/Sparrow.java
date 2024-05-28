package structurale.adapter;

public class Sparrow implements BirdAction{
    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }

    @Override
    public void makeNoise() {
        System.out.println("Sparrow makes noise");
    }
}
