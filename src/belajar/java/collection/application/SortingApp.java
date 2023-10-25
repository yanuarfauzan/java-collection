package belajar.java.collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of("Yanuar", "Fauzan", "Isnain", "Belajar", "Java"));

        Collections.sort(list);

        for (var value : list) {
            System.out.println(value);
        }
    }
}
