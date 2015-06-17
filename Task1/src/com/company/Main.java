package com.company;

public class Main {

    public static void main(String[] args) {
        //a,b are positive(highest bit is 0).
        int a = 0x7ffffffc;
        int b = 0x7ffffffe;

        //a+b in hex format
        //negative(highest bit is 1)
        //so using compliment transformation we getting a = 1010 => 0101 + 1 = 6
        int e = 0xfffffffa;
        
        //to prevent overflow use another type wiсh could store the summ of maximum integers:
        long correctSum = (long)a + b;

        int c = a + b;
        System.out.println(a);
        System.out.println(c);
        System.out.println(e);
        System.out.println(correctSum);
    }
}
