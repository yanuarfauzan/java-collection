package belajar.java.collection.application;

import java.util.SortedSet;
import java.util.TreeSet;

import belajar.java.collection.data.Person;
import belajar.java.collection.data.PersonComparator;

public class SortedSetApp {

    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        
        people.add(new Person("Eko"));
        people.add(new Person("Ani"));
        people.add(new Person("Asep"));

        for (var person : people)
        {
            System.out.println(person.getName());
        }
    }


}
