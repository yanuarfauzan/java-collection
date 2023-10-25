package belajar.java.collection.application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        // menambah data ke collection
        collection.add("Yanuar");
        collection.add("Fauzan");
        collection.add("Isnain");

        for (var value : collection) {
            System.out.println(value);
        }

        // menghapus data tertentu
        collection.remove("Yanuar");
        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(collection.contains("Fauzan"));
        System.out.println(
            collection.containsAll(List.of("Fauzan", "Isnain"))
        );

        System.out.println(collection.size() );
        
    }
}
