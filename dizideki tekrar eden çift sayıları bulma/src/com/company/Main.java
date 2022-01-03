package com.company;

public class Main {

    static boolean issingle(int[]arr,int value)
    {
        if (value % 2 == 0)
        {
            return true;
        }
        return false;
    }
    static boolean isFind(int[] arr,int value)
    {

            for (int i : arr)
            {
                if (i == value)
                {
                    return false;
                }
            }

        return  true;
    }
    public static void main(String[] args) {
	// write your code here
        int list[]={2,4,6,9,2,8,4,8,7,10,9,7,9};
        int startindex = 0;
        int[] dublicate=new int[list.length];
        for(int i =0;i< list.length;i++)
        {
            for (int j=0;j<list.length;j++)
            {
                if (i !=j && list[i] == list[j])
                {
                    if (isFind(dublicate,list[i]) && issingle(dublicate,list[i]))
                    {
                        dublicate[startindex++]=list[i];
                        break;
                    }
                }
            }
        }
        for (int value : dublicate)
        {
            if (value !=0)
            {
                System.out.print(value);
            }
        }

    }
}
