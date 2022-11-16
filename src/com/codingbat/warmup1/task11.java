package com.codingbat.warmup1;

/*
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

 */


public class task11 {
    public static void main(String[] args) {
        int test2;
        String test = "jane";
        frontBack(test);
    }

    public static String frontBack(String str) {
        if (str.length() == 1 ){
            return str;
        }
        String middle = str.substring(1, str.length() - 1);
        str =  str.charAt(str.length() - 1) + middle + str.charAt(0);
        System.out.println(str);
        return str;
    }
    //end
}
