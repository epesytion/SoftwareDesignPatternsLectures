package Factoryy.first;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by sth");
    }
}
