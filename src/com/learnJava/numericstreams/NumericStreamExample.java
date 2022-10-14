package com.learnJava.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamExample {

    //IntStream.rangeClosed(1,50) include 1,2,3...50
    //IntStream.range(1,50) include 1,2,3...49

    static int sumOfInt = IntStream.rangeClosed(1,6).sum();

    public static void main(String[] args) {

        System.out.println(sumOfInt);

        IntStream.range(1,20).forEach(value -> System.out.print(value+","));
        System.out.println("range close");
        IntStream.rangeClosed(1,20).forEach(value -> System.out.print(value+","));
        System.out.println("long range");
        LongStream.range(1,20).forEach(value -> System.out.println(value+","));
        System.out.println("long range close");
        LongStream.rangeClosed(1,20).forEach(value -> System.out.print(value+","));

        // no range,rangeclosed in DoubleStream so
        System.out.println("double range close");
        IntStream.rangeClosed(1,20).asDoubleStream().forEach(value -> System.out.print(value+","));

    }
}
