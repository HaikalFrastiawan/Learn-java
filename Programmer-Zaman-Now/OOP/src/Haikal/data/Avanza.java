package Haikal.data;

public class Avanza implements Car{
    @Override
    public void drive() {
        System.out.println("Avanza Drive");
    }

    @Override
    public int getTier() {
        return 4;
    }
}
