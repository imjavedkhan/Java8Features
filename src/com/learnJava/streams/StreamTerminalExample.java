package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class StreamTerminalExample {

    static Map<Double,List<Student>> group = StudentDataBase.getAllStudents().stream()
            .collect(groupingBy(Student::getGpa));

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("hello", "world");

        System.out.println(stringStream.collect(Collectors.joining(",")));

        Stream<String> stringStreamcount = Stream.of("hello", "world");

        System.out.println("Count : " +stringStreamcount.collect(Collectors.counting()));

        System.out.println(group);


    }
}
