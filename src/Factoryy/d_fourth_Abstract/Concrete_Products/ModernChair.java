package Factoryy.d_fourth_Abstract.Concrete_Products;

import Factoryy.d_fourth_Abstract.Abstract_Products.Chair;

//Concrete Product 1 for Chair
public class ModernChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on Modern Chair");
    }
}
