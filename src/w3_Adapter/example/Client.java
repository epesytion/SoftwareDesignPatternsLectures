package w3_Adapter.example;

public class Client {
    static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.print("hello");
    }
}
