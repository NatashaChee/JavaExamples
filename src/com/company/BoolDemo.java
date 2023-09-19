package com.company;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        //переменная логич типа может стоять в условии оператора if
        if (b) System.out.println("Выражение 10 > 9 имеет значение " + (10 > 9));
    }
}
