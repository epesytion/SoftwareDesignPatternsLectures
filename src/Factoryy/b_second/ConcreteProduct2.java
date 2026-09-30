package Factoryy.b_second;
// Third step: Concrete product 2, that override method uniquely from the Product interface. (next - Creator)

public class ConcreteProduct2 implements Product{
    @Override
    public void declare() {
        System.out.println("I am a woman");
    }
}
