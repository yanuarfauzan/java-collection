package belajar.java.collection.application;

import java.util.List;

import belajar.java.collection.data.Person;

// Contoh Problem mutable list
public class MutableListApp {

    public static void main(String[] args) {
        Person person = new Person("Yanuar");

        person.addHobby("game");
        person.addHobby("codding");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan Hobby");
    }

}
