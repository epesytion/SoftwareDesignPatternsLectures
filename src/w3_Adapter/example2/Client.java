package w3_Adapter.example2;

public class Client {
    static void main(String[] args) {
        Adaptee adaptee = new Adaptee();

        Target target = new Adapter(adaptee);
        target.print("Name");
    }
}
