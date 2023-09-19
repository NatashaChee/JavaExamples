package com.company;

public class ScopeDemo {
    public static void main (String[] args) {
        int x; //переменная видна во всем методе main

        x = 1;
        System.out.println("До вложенного блока: x равно " + x);

       {
            //новый блок создает новую область видимости
            int y = 3;

            //здесь действуют обе переменных, x и y
            System.out.println("Внутренний блок: x равно " + x + ", y равно " + y);
            x = y * 3;
       }
         //конец вложенного блока

        // y = 100;
        System.out.println("После вложенного блока: x равно " + x);
    }
}
