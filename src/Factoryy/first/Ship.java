package Factoryy.first;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("By water");
    }
}
