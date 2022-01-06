package com.company;

public class Main {

    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome("ab ba"));
    }
}
