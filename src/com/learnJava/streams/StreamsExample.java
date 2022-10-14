package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
import com.learnJava.functionalInterfaces.PredicateStudentExample;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> studentPredicategpa = student -> student.getGpa()>=3.9;

        Map<String,Double> studentmap = StudentDataBase.getAllStudents()
                .stream()
                .peek(System.out::println)
                .filter(studentPredicate)
                .peek(student -> System.out.println("After 1 filter" + student))
                .filter(studentPredicategpa)
                .peek(student -> System.out.println("After 2 filter" + student))
                .collect(Collectors.toMap(Student::getName,Student::getGpa));

        System.out.println(studentmap);

    }
}
