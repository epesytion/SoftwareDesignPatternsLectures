package Factoryy.d_fourth_Abstract.Concrete_Products;
//Concrete Product 2 for Sofa

import Factoryy.d_fourth_Abstract.Abstract_Products.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Laying on Victorian sofa");
    }
}
