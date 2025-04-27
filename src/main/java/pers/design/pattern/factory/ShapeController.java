package pers.design.pattern.factory;

public class ShapeController {
    private final ShapeFactory shapeFactory;

    public ShapeController() {
        this.shapeFactory = new ShapeFactory();
    }

    public void drawShape(String shapeType) {
        Shape shape = shapeFactory.getShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Invalid shape type!");
        }
    }
}