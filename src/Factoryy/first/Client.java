package Factoryy.first;

public class Client {
    static void main(String[] args) {
        Transport transport = new Truck();
        transport.deliver();
    }
}
