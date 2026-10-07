package w2_Factoryy.c_third_shapes;
//Here we just combined concrete factories to one factory using if-elsse
public class ShapeFactory {
    public Shape_product getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle_concrProd();
        if (shapeType.equalsIgnoreCase("SQUARE")) return new Square_concrProd();
        return null;
    }
}
