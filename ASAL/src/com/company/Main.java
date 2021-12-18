package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        course mat = new course("Matematik", "MAT101", "MAT");
        course fizik = new course("Fizik", "FZK101", "FZK");
        course kimya = new course("Kimya", "KMY101", "KMY");
        course sozlumat= new course("sozlümat","MAT101","MAT");
        course sozlufzk= new course("sozlufzk","FZK101","FZK");
        course sozlukmy= new course("sozlukmy","KMY101","KMY");



        teacher t1 = new teacher("Mahmut Hoca", "90550000000", "MAT");
        teacher t2 = new teacher("Fatma Ayşe", "90550000001", "FZK");
        teacher t3 = new teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya,sozlufzk,sozlumat,sozlukmy);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkQuiznote(50,50,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya,sozlufzk,sozlumat,sozlukmy);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkQuiznote(80,50,60);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya,sozlufzk,sozlumat,sozlukmy);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkQuiznote(30,70,60);
        s3.isPass();
    }
}
