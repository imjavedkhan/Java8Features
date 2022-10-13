package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.functionalInterfaces.PredicateStudentExample;
import com.learnJava.functionalInterfaces.SupplierExample;

import java.util.function.Predicate;

public class RefactorMethodReference {

   // static Predicate<Student> p1 = student -> student.getGradeLevel()>=3;

    //Another way to do this...
    static Predicate<Student> p1 = RefactorMethodReference::grade;

    public static boolean grade(Student s){
        return s.getGradeLevel()>3;
    }


    public static void main(String[] args) {

        System.out.println(p1.test(SupplierExample.getStudent().get()));

    }
}
