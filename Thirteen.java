package com.company;

import java.util.Scanner;

public class Thirteen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String lat = "^[a-zA-Z]+$";
        System.out.println("Введите выражение : ");
        String[] strArray = sc.nextLine().split(" ");
        int count = 0;
        for (String str : strArray) {
            if (str.matches(lat)) {
                System.out.println(str);
                count++;
            }
        }
        System.out.println("Слова, состоящие только из латиницы : " + count);
    }
}