package com.company;

import java.util.Scanner;

public class Main {
    static int üsalma(int a ,int b){

        if (b==0)
        {
            return 1;
        }
        int result  = a * üsalma(a,b-1);
        return result;
    }
    public static void main(String[] args) {
	// write your code
        Scanner scan = new Scanner(System.in);
        System.out.print("taban deger: ");
        int taban = scan.nextInt();
        System.out.print("üs deger: ");
        int üs = scan.nextInt();
        System.out.println("Sonuc: "+üsalma(taban,üs));

    }
}
