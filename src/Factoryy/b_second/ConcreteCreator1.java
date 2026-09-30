package Factoryy.b_second;
// Fifth step: concrete creator 1 that overrides method from Creator interface and return one of ConcreteProduct
public class ConcreteCreator1 implements Creator{
    @Override
    public Product gender() {
        return new ConcreteProduct1();
    }
}
