package com.company;

import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {

        System.out.println("Введите 1-е  число");
            Scanner sc = new Scanner(System.in);
            String str = Double.toString(sc.nextDouble());
            System.out.println("Введите 2-e  число");
            int value = (int) sc.nextDouble();
            System.out.println("MAX число " + Math.max(Double.valueOf(str), Double.valueOf(value)));
            System.out.println("MIN число " + Math.min(Double.valueOf(str), Double.valueOf(value)));
    }
}