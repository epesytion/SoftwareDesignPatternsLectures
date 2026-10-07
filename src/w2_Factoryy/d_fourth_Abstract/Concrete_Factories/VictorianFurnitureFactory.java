package w2_Factoryy.d_fourth_Abstract.Concrete_Factories;

import w2_Factoryy.d_fourth_Abstract.Abstract_Factory.FurnitureFactory;
import w2_Factoryy.d_fourth_Abstract.Abstract_Products.Chair;
import w2_Factoryy.d_fourth_Abstract.Abstract_Products.Sofa;
import w2_Factoryy.d_fourth_Abstract.Concrete_Products.VictorianChair;
import w2_Factoryy.d_fourth_Abstract.Concrete_Products.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair actionChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa actionSofa() {
        return new VictorianSofa();
    }
}
