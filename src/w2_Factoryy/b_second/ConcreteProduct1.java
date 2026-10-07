package w2_Factoryy.b_second;
// Second step: Concrete product 1, that override method uniquely from the Product interface. (next - concrete 2)
public class ConcreteProduct1 implements Product{
    @Override
    public void declare() {
        System.out.println("I am a man");
    }
}
