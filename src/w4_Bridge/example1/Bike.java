package w4_Bridge.example1;

//Refined Abstraction
public class Bike extends Vehicle{
    public Bike(Workshop workshop1, Workshop workshop2){
        super(workshop1, workshop2);

    }
    @Override
    void manufacture() {
        workshop1.work();
        workshop2.work();
    }
}
