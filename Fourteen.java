package com.company;

public class Fourteen {

    public static void main(String[] args) {

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            int a = -20;
            int b = 20;
            array[i] = a + (int) (Math.random() * ((b - a) + 1));
            System.out.print(array[i] + "; ");
        }
        int max = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= max) {
                max = array[j];
            }
        }
        System.out.println("\nМаксимальный элемент массива : " + max);
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива : " + min);
        int modulMax = Math.abs(max);
        int modulMin = Math.abs(min);
        System.out.println("Наибольшее по модулю MAX: " + modulMax + "\n" + "Наибольшее по модулю MIN: " + modulMin);
    }
}