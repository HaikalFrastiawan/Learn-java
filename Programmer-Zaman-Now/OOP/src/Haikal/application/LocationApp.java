package Haikal.application;

import Haikal.data.City;
import Haikal.data.Location;

public class LocationApp {
    public static void main(String[] args) {

        var city = new City();
        city.name = "jakarta";

        System.out.println(city.name);
    }
}
