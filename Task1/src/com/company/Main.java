package com.company;

public class Main {

    public static void main(String[] args) {
        //a,b ������������� �����(������� ��� ����� 0).
        int a = 0x7ffffffc;
        int b = 0x7ffffffe;

        //a+b in hex format
        //������� ��� ����� �������, ��������������, ����� �������������.
        //�������� ����� ����� �������� XOR-�� �� ����� �����. �� ����: 0x00000006
        int e = 0xfffffffa;

        int c = a + b;
        System.out.println(a);
        System.out.println(c);
        System.out.println(e);
    }
}
