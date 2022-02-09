package com.company;

import java.util.Scanner;

public class Titleseven {

    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте значения константам х, у, z ");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        System.out.println("X = " + x + " " + "Y = " + y + " " + "Z =" + z);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив числами:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            if (array[i] == x || (array[i] == y) || (array[i] == z)) {
                System.out.println("Данное значение имеется в константах");
                break;
            } else {
                if (array[i] != x || (array[i] != y) || (array[i] != z)) {
                    System.out.println("Совпадения не найдены. Введите еще раз");
                }
            }
        }
    }
}