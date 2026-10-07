package w2_Factoryy.b_second;
// The final step: getting result by a client class

public class Client {
    static void main(String[] args) {
        Creator creator = new ConcreteCreator1(); //creator object of Creator class that is actually one of Concrete creators
        Product product = creator.gender(); //bcs gender return Product object (in Creator interface), we can assign it to object

        product.declare(); // call a method

    }
}
