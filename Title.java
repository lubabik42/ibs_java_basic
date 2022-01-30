package com.max.idea;
import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter x, y, z");
        double x, y, z;
        x = num.nextDouble();
        y = num.nextDouble();
        z = num.nextDouble();

        double average = (x + y + z) / 3;
        System.out.println(average);

        double round = Math.floor((average/2));
        System.out.println(round);

        if(round>3)
            System.out.println("Программа выполнена корректно");
    }
}
