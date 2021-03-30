package com.example.domain;

/**
 * 马云飞
 * 2021/1/24
 */
public class Test {

    public static void main(String[] args) {
        String name="";
        String  age=null;
        String  school=null;
        String  name01=null;
        Student student = student(name, age, school, name01);
        System.out.println(student.toString());
    }

    private static Student student(String name,
           String  age,
           String  school,
           String  name01){
        Student student=new Student();
        student.setAge(age);
        student.setName(name);
        student.setName01(name01);
        student.setSchool(school);
        return student;


    }
}
