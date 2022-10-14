package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    static int performmultiplication(List<Integer> list){
       return list.stream()
               .reduce(1,(a,b)->a*b);
    }

    static Optional<Integer> performmultiplicationwithoutidenttity(List<Integer> list){
        return list.stream()
                //.reduce((a,b)->a*b);
                .reduce(Integer::sum);
    }

    static Optional<Student> getStudentGpa(List<Student> list){
        return list.stream()
                .reduce((a,b)->a.getGpa()> b.getGpa() ? a : b);
    }

    static Optional<Double> getMaxGpa(List<Student> list){
        return list.stream()
                .map(Student::getGpa)
                .reduce(Double::max);
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        System.out.println(performmultiplication(list));

        Optional<Integer> res = performmultiplicationwithoutidenttity(list);

        System.out.println(res.get());

        Optional<Student> studentres = getStudentGpa(StudentDataBase.getAllStudents());

        System.out.println(studentres.get());

        Optional<Double> maxgpa = getMaxGpa(StudentDataBase.getAllStudents());

        System.out.println(studentres.get());
    }

}
