package belajar.java.collection.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        // Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("eko");
        names.add("kurniawan");
        names.add("khannedy");
        names.add("eko");
        names.add("kurniawan");
        names.add("khannedy");

        for (var value : names) {
            System.out.println(value);
        }
    }
}
