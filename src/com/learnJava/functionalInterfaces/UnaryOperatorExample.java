package com.learnJava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (name)->name.concat("default");

    public static void main(String[] args) {

        System.out.println(unaryOperator.apply("java8"));

    }
}
