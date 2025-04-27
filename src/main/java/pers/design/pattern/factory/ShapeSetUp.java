package pers.design.pattern.factory;

public class ShapeSetUp {
    public static void registerShape(){
        ShapeFactory.initShapeFactory("CIRCLE",new Circle());
        ShapeFactory.initShapeFactory("RECTANGLE",new Rectangle());
    }
}
