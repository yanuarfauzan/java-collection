package belajar.java.collection.application;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Yanuar", "Fauzan", "Isnain");

        for (var name : names){
            System.out.println(name);
        }

    }
}
