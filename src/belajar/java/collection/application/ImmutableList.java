package belajar.java.collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("eko");
        mutable.add("kurniawan");

        List<String> imutableList = Collections.unmodifiableList(mutable);

    }    
}
