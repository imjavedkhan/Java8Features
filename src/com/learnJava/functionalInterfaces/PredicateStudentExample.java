package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>= 3.9;

    static BiPredicate<Integer,Double> biPredicate = (grade,gpa) -> grade>3 && gpa>3.9;

    BiConsumer<String, List<String>> listBiConsumer =
            (name ,activities) -> System.out.println(name + " : " + activities);

    static void filterByGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println("Student grade greater than 3 : "+student.getName());
            }
        });
    }

    static void filterByGpa(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println("Student gpa greater than 3.9 : " + student);
            }
        });
    }

    static void filterByGradeAndGpa(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                // we can also use bipredicate here : biPredicate.test(student.getGradeLevel(),student.getGpa())
                System.out.println("Student gpa greater than 3.9 and grade 3 : " + student);
            }
        });
    }

    Consumer<Student> studentConsumer = (student -> {
        if(p1.and(p2).test(student)){
            listBiConsumer.accept(student.getName(),student.getActivities());
        }
    });

    void printNameAndActivities(List<Student> studentList){
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        //filterByGradeLevel();
        //filterByGpa();
        //filterByGradeAndGpa();

        List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateStudentExample().printNameAndActivities(studentList);

    }
}
