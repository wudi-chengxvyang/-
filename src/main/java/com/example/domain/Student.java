package com.example.domain;

/**
 * 马云飞
 * 2021/1/5
 */
public class Student {
    private String name;
    private String age;
    private String school;
    private String name01;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Student setAge(String age) {
        this.age = age;
        return this;
    }

    public String getSchool() {
        return school;
    }

    public Student setSchool(String school) {
        this.school = school;
        return this;
    }

    public String getName01() {
        return name01;
    }

    public Student setName01(String name01) {
        this.name01 = name01;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", school='" + school + '\'' +
                ", name01='" + name01 + '\'' +
                '}';
    }
}
