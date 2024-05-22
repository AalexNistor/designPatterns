package adapter;

public class BirdAdapter implements BirdPlasticAction{

    private BirdAction birdAction;

    public BirdAdapter(BirdAction birdAction) {
        this.birdAction = birdAction;
    }

    @Override
    public void squeak() {
        System.out.print("Toy ");
        birdAction.makeNoise();
    }
}
