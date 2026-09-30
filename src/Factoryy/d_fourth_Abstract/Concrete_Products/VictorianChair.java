package Factoryy.d_fourth_Abstract.Concrete_Products;

//Concrete Product 2 for Chair

import Factoryy.d_fourth_Abstract.Abstract_Products.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on Victorian (it costs 9999$)");
    }
}
