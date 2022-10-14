package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {

    static List<String> studentsList = StudentDataBase.getAllStudents().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .sorted()
            .collect(toList());

    static long studentActivityCount = StudentDataBase.getAllStudents().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .count();

    public static void main(String[] args) {

        System.out.println(studentsList);

        System.out.println(studentActivityCount);

    }
}
