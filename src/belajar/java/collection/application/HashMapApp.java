package belajar.java.collection.application;

import java.util.HashMap;
import java.util.Map;

// Map Interface
public class HashMapApp {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();

        map.put("name.first", "eko");
        map.put("name.second", "kurniawan");
        map.put("name.third", "khannedy");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.second"));
        System.out.println(map.get("name.third"));
    }
}
