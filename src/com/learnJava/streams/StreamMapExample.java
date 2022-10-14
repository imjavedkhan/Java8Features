package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamMapExample {

    static List<String> studentsList = StudentDataBase.getAllStudents().stream()
            .map(Student::getName)
            .map(String::toUpperCase)
            .collect(toList());

    public static void main(String[] args) {

        System.out.println(studentsList);

    }
}
