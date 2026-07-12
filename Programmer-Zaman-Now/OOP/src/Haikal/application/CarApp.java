package Haikal.application;

import Haikal.data.Avanza;
import Haikal.data.Car;


public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
