package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> function2 = (name) -> name.toUpperCase().concat("function");

    static Function<List<Student>, Map<String,Double>> studentFunction = (studentList -> {
       Map<String,Double> StudentGpaMap = new HashMap<>();
       studentList.forEach(student -> {
           if(PredicateStudentExample.p1.test(student)) {
               StudentGpaMap.put(student.getName(), student.getGpa());
           }
       });
       return StudentGpaMap;
    });

    public static void main(String[] args) {

        System.out.println("Result : " +function.apply("java8") );
        //first function will be execute and then function2
        System.out.println("Result of function 2 : " +function.andThen(function2).apply("java8") );
        //first function2 will be execute and then function1
        System.out.println("Result of function 2 : " +function.compose(function2).apply("java8") );

        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

    }
}
