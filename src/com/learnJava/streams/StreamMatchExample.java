package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMatchExample {

    // allmatch, anymatch, nonematch return boolean

    static boolean allgpa = StudentDataBase.getAllStudents().stream()
            .allMatch(Student-> Student.getGpa()>=3.5);

    static boolean anygpa = StudentDataBase.getAllStudents().stream()
            .anyMatch(Student-> Student.getGpa()>=3.9);

    static boolean nonegpa = StudentDataBase.getAllStudents().stream()
            .noneMatch(Student-> Student.getGpa()>=4.1);

    public static void main(String[] args) {

        System.out.println(allgpa);
        System.out.println(anygpa);
        System.out.println(nonegpa);

    }
}
