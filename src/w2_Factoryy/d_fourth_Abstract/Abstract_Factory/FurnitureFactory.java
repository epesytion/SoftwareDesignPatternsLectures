package w2_Factoryy.d_fourth_Abstract.Abstract_Factory;

import w2_Factoryy.d_fourth_Abstract.Abstract_Products.Chair;
import w2_Factoryy.d_fourth_Abstract.Abstract_Products.Sofa;

public interface FurnitureFactory {
    Chair actionChair();
    Sofa actionSofa();
}
