package Factoryy.d_fourth_Abstract.Concrete_Factories;

import Factoryy.d_fourth_Abstract.Abstract_Factory.FurnitureFactory;
import Factoryy.d_fourth_Abstract.Abstract_Products.Chair;
import Factoryy.d_fourth_Abstract.Abstract_Products.Sofa;
import Factoryy.d_fourth_Abstract.Concrete_Products.VictorianChair;
import Factoryy.d_fourth_Abstract.Concrete_Products.VictorianSofa;

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
