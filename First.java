package com.max.idea;
import java.text.DecimalFormat;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        DecimalFormat format = new DecimalFormat("##.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара");
        double exchangeRate = scanner.nextDouble();
        System.out.println("Введите сумму, которую хотите конвертировать :");
        double RUB = scanner.nextDouble();
        double convert = RUB / exchangeRate;
        System.out.println("Ваша сумма в рублях : " + RUB + ", в долларах составит : " + format.format(convert));

    }
}