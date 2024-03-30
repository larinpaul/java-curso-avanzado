package org.example.streamslambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Streams / Lambda

        List<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("Barcelona");
        cities.add("Buenos Aires");
        cities.add("Bogota");
        cities.add("Ciudad de Mexico");
        cities.add("Lima");

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }

        System.out.println();

        for (String city : cities) {
            System.out.print(city + " ");
        }

        System.out.println();

        // Todo esto se puede hacer con streams...
        cities.stream().forEach(city -> System.out.print(city + " "));


    }

}
