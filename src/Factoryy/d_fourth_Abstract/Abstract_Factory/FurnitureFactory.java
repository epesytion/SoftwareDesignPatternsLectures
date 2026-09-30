package Factoryy.d_fourth_Abstract.Abstract_Factory;

import Factoryy.d_fourth_Abstract.Abstract_Products.Chair;
import Factoryy.d_fourth_Abstract.Abstract_Products.Sofa;

public interface FurnitureFactory {
    Chair actionChair();
    Sofa actionSofa();
}
