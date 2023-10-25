package belajar.java.collection.application;

import java.util.Collections;
import java.util.Map;

public class ImutableMapApp {
    public static void main(String[] args) {
        Map<String, String> map = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "eko");

        Map<String, String> mapp = Map.of(
            "name1", "eko",
            "name2", "yanuar"
        );
    }
}
