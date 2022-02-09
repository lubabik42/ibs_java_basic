package com.company;
import java.util.Scanner;

public class Titlenine {


    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Длина массива: ");
        double[] array = new double[sc.nextInt()];
        System.out.println("Заполните ваш массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
        double result = 0;
        for (double d : array) {
            result += d;
        }
        System.out.println("Среднее арифметическое: " + result / array.length);
        for (double d : array) {
            System.out.println("Результат умножения на СА: " + d * (result / array.length));
        }
    }
}