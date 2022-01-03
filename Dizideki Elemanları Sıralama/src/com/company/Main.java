package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner input =new Scanner(System.in);
        System.out.print("Dizinin boyutu  :");
        int a=input.nextInt();
        int[] dizi =new int[a];
        for (int i=0;i<a;i++)
        {
            int c=i+1;
            System.out.print("dizinin " +c +".değeri: " );
            int b=input.nextInt();
            dizi[i]=b;
        }
        Arrays.sort(dizi);
        System.out.print("Sıralama: "+Arrays.toString(dizi));
    }
}
