package com.company.JavaBase.Lesson3.Exercise_2;

public class BadPupil extends Pupil{
    public BadPupil(String name, int age){super(name, age);}
    @Override
    void study() {say("не люблю учиться");}
    @Override
    void read() {say("не люблю читать");}
    @Override
    void write() {say("не люблю писать");}
    @Override
    void relax() {say("люблю отдыхать");}
}
