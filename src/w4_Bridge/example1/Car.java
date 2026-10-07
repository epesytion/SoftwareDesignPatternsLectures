package w4_Bridge.example1;

//Refined abstraction
public class Car extends Vehicle{
    public Car(Workshop workshop1, Workshop workshop2){
        super(workshop1, workshop2);
    }

    @Override
    void manufacture() {
        System.out.println("CAR");
        workshop1.work();
        workshop2.work();
    }

}
