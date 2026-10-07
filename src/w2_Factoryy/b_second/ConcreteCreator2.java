package w2_Factoryy.b_second;
// Sixth step: Concrete Creator2 that overrides method from Creator interface and returns the other concrete product. (next - client)
public class ConcreteCreator2  implements Creator {
    @Override
    public Product gender() {
        return new ConcreteProduct2();
    }
}
