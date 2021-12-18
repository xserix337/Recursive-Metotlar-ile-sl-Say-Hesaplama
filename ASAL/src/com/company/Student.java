package com.company;

public class Student {
    String name,stuNo;
    int classes;
    course quizf;
    course quizm;
    course quizk;
    course mat;
    course fizik;
    course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, course mat,course fizik,course kimya,course quizf,course quizm,course quizk) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.quizm = quizm;
        this.quizf = quizf;
        this.quizk = quizk;
        calcAvarage();
        this.isPass = false;
    }
    public void addBulkQuiznote(int quizf,int quizm,int quizk)
    {
        this.quizf.note=quizf;
        this.quizk.note=quizk;
        this.quizm.note=quizm;

    }
    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note*80/100)+(this.quizf.note*20/100)) + ((this.kimya.note*90/100)+(this.quizk.note*10/100)) + ((this.mat.note*60/100)+(this.quizm.note*40/100))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}
