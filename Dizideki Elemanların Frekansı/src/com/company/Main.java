package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int[] arr ={10, 20, 20, 10, 10, 20, 5, 20};
        int count=1;
        for (int i=0;i<arr.length;i++)
        {
            count=1;
            for (int j=0;j< arr.length;j++)
            {
                if ((i!=j) && (arr[i]==arr[j]))
                {
                    count++;
                }
            }
            System.out.println(arr[i]+" sayısı "+count+" defa tekrar edildi");
        }

    }
}
