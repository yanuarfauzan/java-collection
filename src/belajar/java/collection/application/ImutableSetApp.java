package belajar.java.collection.application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Eko");

        Set<String> mutable = new HashSet<>();
        mutable.add("Eko");
        mutable.add("Asep");

        // membuat imutable set
        Set<String> imutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Yanuar", "Koromod");

        set.add("kamu");
        System.out.println(set);
        
    }
}
