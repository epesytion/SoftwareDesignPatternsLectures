package w2_Factoryy.d_fourth_Abstract.Concrete_Products;
//Concrete Product 1 for Sofa

import w2_Factoryy.d_fourth_Abstract.Abstract_Products.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Laying on Modern Sofa");
    }
}
