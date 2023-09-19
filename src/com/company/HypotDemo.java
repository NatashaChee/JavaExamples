package com.company;

public class HypotDemo {
    public static void main(String[] args) {
        double cath1, cath2, hypot;

        cath1 = 3; // длина 1го катета
        cath2 = 4; // длина 2го катета

        hypot = Math.sqrt((cath1 * cath1) + (cath2 * cath2));

        System.out.println("длина гипотенузы равна " + hypot);

    }
}
