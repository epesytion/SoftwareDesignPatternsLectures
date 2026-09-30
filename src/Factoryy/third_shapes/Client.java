package Factoryy.third_shapes;

import java.awt.*;

public class Client {
    static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape_product shape = factory.getShape("CIRCLE");
        shape.draw();
    }
}
