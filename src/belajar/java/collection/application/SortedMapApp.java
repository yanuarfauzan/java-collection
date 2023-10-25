package belajar.java.collection.application;

import java.util.NavigableMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("1", "Yanuar");
        map.put("2", "Jujun");
        map.put("3", "Mumu");

        for (var key : map.keySet())
        {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("1"));
    }
}
