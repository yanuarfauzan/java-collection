package belajar.java.collection.application;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        
        NavigableSet<String> names = new TreeSet<>();

        names.addAll(Set.of("Yanuar", "Fauzan", "Isnain"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> kurniawan = names.tailSet("kurniawan", true);

        for (var name : kurniawan)
        {
            System.out.println(name);
        }
    }
}
