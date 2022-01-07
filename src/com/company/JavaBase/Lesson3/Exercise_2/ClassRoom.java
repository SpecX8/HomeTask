package com.company.JavaBase.Lesson3.Exercise_2;

public class ClassRoom {
    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Pupil pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }

    public static void main(String[] args) {

        Pupil pupil1 = new BadPupil("Вася", 20);
        Pupil pupil2 = new GoodPupil("Максим", 18);
        Pupil pupil3 = new ExcellentPupil("Иван", 18);
        Pupil pupil4 = new GoodPupil("Пётр", 19);

        ClassRoom classRoom = new ClassRoom( pupil1, pupil2, pupil3, pupil4);

        Pupil[] pupils = {pupil1,pupil2,pupil3,pupil4};
        for(Pupil pupil : pupils){
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
        }
    }
}
