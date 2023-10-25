package belajar.java.collection.application;

import java.util.EnumSet;

public class EnumSetApp {
    public static enum Gender {
        MALE, FEMALE,  NOTE_MENTION
    }

    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE, Gender.FEMALE);

        for (var gender : genders){
            System.out.println(gender);
        }
    }
}
