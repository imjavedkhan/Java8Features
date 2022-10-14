package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamFindExample {

    static Optional<Student> findstudent = StudentDataBase.getAllStudents().stream()
            .filter(s->s.getGpa()>=3.9)
            .findAny();

    static Optional<Student> findfirststudent = StudentDataBase.getAllStudents().stream()
            .filter(s->s.getGpa()>=3.9)
            .findFirst();

    public static void main(String[] args) {

        System.out.println(findstudent.get());

        System.out.println(findfirststudent.get());

    }
}
