package com.company;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int vergi;
    int bonus;
    int artıs;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.salary=salary;
        this.vergi = tax(this.salary);
        this.bonus=bonus();
        this.artıs=raiseSalary();
    }
    public int tax(int vergi)
    {
        if (this.salary < 1000)
        {
            return 0;
        }
        else
        {
            vergi=(salary*3/100);
            return vergi;
        }
    }
    int bonus(){
        int bonus;
        if (this.workHours > 40)
        {
         return bonus = 30*(workHours-40);
        }
        else {
          return bonus=0;
        }
    }
    int raiseSalary(){
        int artıs=0;
        int toplamyıl=2021-(this.hireYear);
        if (toplamyıl<10)
        {
            artıs=salary*5/100;
        }
        else if (10<toplamyıl && toplamyıl<20){
            artıs =salary*10/100;
        }
        else if (toplamyıl>20){
            artıs=salary*15/100;
        }
        return artıs;

    }
    void  print()
    {
        System.out.println("Adı : "+this.name);
        System.out.println("maaşı : "+this.salary);
        System.out.println("saat : "+this.workHours);
        System.out.println("başlangıç yılı : "+this.hireYear);
        System.out.println("vergi : "+this.vergi);
        System.out.println("bonus : "+this.bonus);
        System.out.println("maaş artışı : "+this.artıs);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+(this.salary-(vergi-bonus)));
        System.out.println("Toplam Maaş:"+((this.salary+artıs)));

    }

}
