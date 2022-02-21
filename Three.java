package com.max.idea;
import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        int strNum;
        int index = 0;
        int maxNumChar = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        strNum = sc.nextInt();
        String[] stringsArray = new String[strNum];
        int[] numberCharInString = new int[strNum];
        System.out.println("Введите строки:");
        for (int i = 0; i < stringsArray.length; i++) {
            stringsArray[i] = sc.next();
            numberCharInString[i] = (int) stringsArray[i].chars().distinct().count();
            if (numberCharInString[i] > maxNumChar) {
                maxNumChar = numberCharInString[i];
                index = i;
            }
        }
        System.out.println("Строка с максимальным количеством различных символов : " + stringsArray[index]);
    }
}