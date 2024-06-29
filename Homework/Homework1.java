package com.telran.org.Homework;

import java.sql.SQLOutput;

public class Homework1 {

    public static void main(String[] args) {

        char a = 'G';
        int b = 89;
        byte c = 4;
        short d = 56;
        float e = 4.7333436f;
        double f = 4.355453532;
        long g = 12121;

        System.out.println("char: " + a);
        System.out.println("integer: " + b);
        System.out.println("byte: " + c);
        System.out.println("short: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("long: " + g);

        int number = 345;
        int hundreds = (number / 100);
        int teens = (number / 10) % 10;
        int units = number % 10;

        System.out.println("Число " + number + " -> "+ hundreds + "," + teens + "," + units);
    }
}
