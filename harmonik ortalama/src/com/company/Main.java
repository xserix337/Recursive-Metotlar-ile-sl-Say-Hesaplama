package com.company;
import java.util.Arrays;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] dizi = { 1,2,3,4,5,6,7 };
        double harmonik = 0.0;
        for (int i : dizi)
        {
            harmonik +=(1.0 / i);
        }
        double geomen = dizi.length/ harmonik;
        System.out.println(geomen);




    }
}
