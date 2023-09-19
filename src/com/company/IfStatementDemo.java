package com.company;

public class IfStatementDemo {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 2;
        b = 3;

        System.out.println("a равно 2, b равно 3");
        if (a < b) System.out.println("a меньше b");
        if (a > b) System.out.println("этот текст вы никода не увидите");

        System.out.println("");

        c = a - b; // c будет равно -1
        System.out.println("c равно -1");
        if (c >= 0) System.out.println("c положительное");
        if (c < 0) System.out.println("c отрицательное");

        System.out.println("");
        d = b - a; // d равно 1
        System.out.println("d равно 1");

        if (d >= 0) System.out.println("d положительное");
        if (d < 0) System.out.println("d отрицательное");

        System.out.println("");

        if (a + c !=b) System.out.println("a + c не равняется b");
        if (a + d ==b) System.out.println("a + d равняется b");



    }
}
