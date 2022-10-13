package com.learnJava.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("A: " + a + " B: " + b);

        BiConsumer<Integer,Integer> multiply = (a,b) -> System.out.println("multiply: " + (a*b));

        BiConsumer<Integer,Integer> divide = (a,b) -> System.out.println("divide : " + (a/b));


        biConsumer.accept("javed","khan");
        multiply.accept(2,2);
        divide.accept(6,2);
        multiply.andThen(divide).accept(3,3);
    }
}
