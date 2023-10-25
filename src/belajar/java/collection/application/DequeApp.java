package belajar.java.collection.application;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        
        Deque<String> stack = new LinkedList<>();

        stack.offerFirst("Yanuar");
        stack.offerFirst("Fauzan");
        stack.offerFirst("Isnain");

        for (var value : stack)
        {
            System.out.println(value);
        }
    }
}
