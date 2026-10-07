package w2_Factoryy.c_third_shapes;

public class Client {
    static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape_product shape = factory.getShape("CIRCLE");
        shape.draw();
    }
}
