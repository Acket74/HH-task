package com.company;

public class Main {

    public static void main(String[] args) {
        //a,b положительные числа(старший бит равен 0).
        int a = 0x7ffffffc;
        int b = 0x7ffffffe;

        //a+b in hex format
        //Старший бит равен единице, соответственно, число отрицательное.
        //Значение целой части получаем XOR-ом от всего числа. То есть: 0x00000006
        int e = 0xfffffffa;

        int c = a + b;
        System.out.println(a);
        System.out.println(c);
        System.out.println(e);
    }
}
