package Haikal.application;

import Haikal.data.Animal;
import Haikal.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "puss";
        animal.run();
    }
}
