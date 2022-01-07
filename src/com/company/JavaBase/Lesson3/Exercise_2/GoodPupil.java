package com.company.JavaBase.Lesson3.Exercise_2;

public class GoodPupil extends Pupil {
    public GoodPupil(String name, int age) {super(name, age);}
    @Override
    void study() {say("хорошо учусь");}
    @Override
    void read() {say("хорошо читаю");}
    @Override
    void write() {say("хорошо пишу");}
    @Override
    void relax() {say("я иногда отдыхаю");}
}
