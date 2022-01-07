package com.company.JavaBase.Lesson3.Exercise_2;

public class ExcellentPupil extends Pupil{
    public ExcellentPupil(String name, int age) {super(name, age);}
    @Override
    void study() {say("люблю учиться");}
    @Override
    void read() {say("люблю читать");}
    @Override
    void write() {say("люблю писать");}
    @Override
    void relax() {say("я умею отдыхать");}
}
