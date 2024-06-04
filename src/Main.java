import factory.Shape;
import factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        singleton.showMessage();

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
    }
}