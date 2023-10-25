package belajar.java.collection.application;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(10);

        queue.add("Yanuar");
        queue.add("Fauzan");
        queue.add("Isnain");
        for (int i = 0; i < 10; i++) {
            queue.add(String.valueOf(i));
        }

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
