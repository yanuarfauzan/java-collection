package belajar.java.collection.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    // Membuat agar list Immutable list
    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    

}
