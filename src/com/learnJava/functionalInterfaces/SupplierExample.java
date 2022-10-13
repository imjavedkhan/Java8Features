package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {

   public static Supplier<Student> getStudent(){
        return ()->{
            return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        };
    }

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = ()->{
          return  new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        };

        System.out.println(getStudent().get());
    }
}
