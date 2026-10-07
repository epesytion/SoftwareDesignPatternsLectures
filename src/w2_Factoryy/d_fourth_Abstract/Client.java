package w2_Factoryy.d_fourth_Abstract;

import w2_Factoryy.d_fourth_Abstract.Abstract_Factory.FurnitureFactory;
import w2_Factoryy.d_fourth_Abstract.Abstract_Products.Chair;
import w2_Factoryy.d_fourth_Abstract.Abstract_Products.Sofa;
import w2_Factoryy.d_fourth_Abstract.Concrete_Factories.ModernFurnitureFactory;
import w2_Factoryy.d_fourth_Abstract.Concrete_Factories.VictorianFurnitureFactory;

public class Client {
    static void main(String[] args) {
        FurnitureFactory m_factory = new ModernFurnitureFactory();
        Chair m_chair = m_factory.actionChair();
        m_chair.sit();

        FurnitureFactory v_factory = new VictorianFurnitureFactory();
        Sofa v_sofa = v_factory.actionSofa();
        v_sofa.lieOn();
    }
}
