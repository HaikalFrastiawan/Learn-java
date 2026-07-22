package Haikal.application;

import Haikal.data.Constan;
import Haikal.data.Country;
import Haikal.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constan.APPLICATION);
        System.out.println(Constan.VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1,1)
        );
        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());
    }
}
