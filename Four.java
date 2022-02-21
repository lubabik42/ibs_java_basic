package com.max.idea;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 3;
        System.out.println("Загадка: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. \n" +
                "Если нужна подсказка, ввести слово - 'Подсказка', доступна к использованию только 1 раз. или введите свой ответ:");
        do {
            String answer = sc.nextLine();
            switch (answer) {
                case "Заархивированный вирус":
                    System.out.println("Правильно!");
                    count = 0;
                    break;
                case "Подсказка":
                    if (count != 3) {
                        System.out.println("Подсказка уже недоступна \nВведите ответ:");
                        break;
                    } else {
                        System.out.println("Два слова.Первое это файл после 7z или WinRar(прилагательное)," +
                                " второе похоже по значению на грипп.");
                        count = 1;
                        break;
                    }
                default:
                    if (count == 1) {
                        System.out.println("Обидно, приходи в другой раз");
                        count--;
                        break;
                    } else {
                        System.out.println("Подумай еще! \nВведи ответ ещё раз:");
                        count--;
                        break;
                    }
            }
        } while (count > 0);
        sc.close();
    }
}