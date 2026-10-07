package w3_Adapter.example;

public class Adapter implements Target{
    Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void print(String text) {
        adaptee.printText("Hello");
    }
}
