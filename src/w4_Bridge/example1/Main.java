package w4_Bridge.example1;

public class Main {
    static void main(String[] args) {
        Produce produce = new Produce();
        Assemble assemble = new Assemble();
        Vehicle vehicle = new Car(produce, assemble);
        vehicle.manufacture();
    }
}

