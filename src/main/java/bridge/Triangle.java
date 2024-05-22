package bridge;

public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyShapeColor() {
        System.out.print("Triangle colored with: ");
        color.applyColor();
    }
}
