package com.max.idea;
import java.util.Scanner;

public class Titletwo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter x, y");
        double x, y;
        x = num.nextDouble();
        y = num.nextDouble();
        System.out.println("Enter operation: *, +, -, /");
        char operation;
        operation = num.next().charAt(0);

        if (operation =='*' || operation == '+' || operation =='-' || operation =='/'){
            double result=0;
            switch (operation) {
                case '*':
                    result = x * y;
                    break;
                case '+':
                    result = x + y;
                    break;
                case '-':
                    result = x - y;
                    break;
                case '/':
                    result = x / y;
                    break;
            }
            System.out.println(result);

        }
        else
            System.out.println("Invalid value");

    }
}
