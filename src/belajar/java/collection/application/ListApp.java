package belajar.java.collection.application;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Yanuar");
        strings.add("Fauzan");
        strings.add("Isnain");

        strings.set(0, "budi");


        for (var value : strings) {
            System.out.println(value);
        }
        System.out.println(" ");
        System.out.println(strings.get(0));

    }
}
