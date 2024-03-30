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
        //              Aca en "city" los argumentos // Aca el cuerpo de la funcion

        // Metodos por Referencia (Introducido en Java 8)
        cities.stream().forEach(Main::printCity);

        // Lambda
        System.out.println();
        System.out.println("Lambda");
        cities.stream().forEach(city -> System.out.print(city + " "));
        System.out.println();
        System.out.println("Lambda with a static method");
        cities.stream().forEach(city -> Main.printCity(city));

        // Reference to a Method
        System.out.println();
        System.out.println("Method reference");
        cities.stream().forEach(Main::printCity);
        System.out.println();
        System.out.println("Method reference as well");
        cities.stream().forEach(System.out::print);

        // Nosotros podemos reducir cities.stream().forEach() a solo cities.forEach()
        System.out.println();
        System.out.println("Podemos reducir cities.stream().forEach a solo cities.forEach()");
        cities.forEach(System.out::print);
        System.out.println();
        cities.forEach(Main::printCity);

        System.out.println();
        // Podemos ejecutar este proceso forEach() en paralelo con la ayuda de .parallel()
        System.out.println("Podemos usar .parallel() aqui");
        cities.stream().parallel().forEach(System.out::print); // Y si va a ejecutar este forEach, pero no de la manera sequencial
        System.out.println();
        cities.stream().parallel().forEach(Main::printCity);

    }

    public static void printCity(String city) {
        System.out.print(city + " ");
    }

}
