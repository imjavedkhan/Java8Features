package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    // predicates return true or false
    // predicate methods are AND, OR , NEGATE , NOT, EQUAL

    static Predicate<Integer> predicate = i -> i%2==0;
    static Predicate<Integer> predicate1 = (i) -> i%5==0;

    public static boolean predicateAnd(int t){
        return predicate.and(predicate1).test(t);
    }

    public static boolean predicateOr(int t){
        return predicate.or(predicate1).test(t);
    }

    public static boolean predicateNegate(int t){
        return predicate.or(predicate1).negate().test(t);
    }

    public static void main(String[] args) {

        System.out.println(predicate.test(4));

        System.out.println("Predicate AND check : " + predicateAnd(10));
        System.out.println("Predicate AND check : " + predicateAnd(6));

        System.out.println("Predicate OR check : " + predicateOr(6));

        System.out.println("Predicate NEGATE check : " + predicateNegate(6));
    }
}
