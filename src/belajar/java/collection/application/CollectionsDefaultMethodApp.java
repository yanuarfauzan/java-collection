package belajar.java.collection.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class CollectionsDefaultMethodApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        });

            System.out.println(numbers);

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer){
                System.out.println(integer);
            }
        });

    }
}
