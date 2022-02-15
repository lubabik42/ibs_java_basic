package com.company;

import java.util.Scanner;

public class Twelve {

    public static void main(String[] args) {

        String s = "I like Java!!!";
        boolean c = s.contains("Java");
        boolean start = s.startsWith("I like");
        boolean end = s.endsWith("!!!");
        System.out.println("Результат проверки : " + c + " " + start + " " + end);

        String result = s.toUpperCase();
        System.out.println("Вывод : " + result);

        String oldString = "Java";
        String newString = oldString.replace('a', 'o');
        System.out.println(oldString + "\n " + newString.substring(0, 4));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        boolean contains = str.contains("Java");
        System.out.println("1. " + contains);
        boolean startsWith = str.startsWith("I like");
        System.out.println("2. " + startsWith);
        boolean endsWith = str.endsWith("!!!");
        System.out.println("3. " + endsWith);
        if (contains & startsWith & endsWith) {
            System.out.println("4. " + str.toUpperCase());
        }
        System.out.println("5. " + str.replaceAll("a", "o").substring(7, 11));
    }
}