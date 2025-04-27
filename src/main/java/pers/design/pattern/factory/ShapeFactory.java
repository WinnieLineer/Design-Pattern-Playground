package pers.design.pattern.factory;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    // Factory method for creating Shape objects

    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static void initShapeFactory(String shapeName, Shape shape) {
        shapeMap.put(shapeName,shape);
    }

    public Shape getShape(String shapeType) {
        return shapeMap.get(shapeType);
    }
}