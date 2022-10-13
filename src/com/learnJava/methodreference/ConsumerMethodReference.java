package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    static Consumer<String> consumer = System.out::println;

    static Consumer<Student> studentConsumer = System.out::println;

    public static void main(String[] args) {
        consumer.accept("javed");
        StudentDataBase.getAllStudents().forEach(studentConsumer);

    }
}
