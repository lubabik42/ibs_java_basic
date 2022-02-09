package com.company;

import java.util.Scanner;

public class Titleeight {

        public static void main(String[] args) {
            System.out.print("Введите любое целое положительное число:");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int sum = 0;
            for (int i = 1; i <= num; i = i + 2) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }