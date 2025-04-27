package pers.design.pattern.factory;

public class MainApplication {
    public static void main(String[] args) {
        ShapeSetUp.registerShape();
        ShapeController controller = new ShapeController();
        controller.drawShape("CIRCLE");     // Output: Drawing a Circle!
        controller.drawShape("RECTANGLE"); // Output: Drawing a Rectangle!
        controller.drawShape("TRIANGLE");  // Output: Invalid shape type!
    }
}