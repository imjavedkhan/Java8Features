package com.learnJava.methodreference;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String,String> function = s -> s.toUpperCase();

    static Function<String,String> byLambdaReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(function.apply("java"));

        System.out.println(byLambdaReference.apply("java8"));

    }
}
