package com.company.JavaBase.Lesson3.Exercise_2;

public class Pupil {
    String name;
    int age;
    public Pupil(String name, int age) {this.name = name; this.age = age;}
    protected void say(String message){System.out.println(name + ": " + message);}

    void study(){}
    void read(){}
    void write(){}
    void relax(){}
}
