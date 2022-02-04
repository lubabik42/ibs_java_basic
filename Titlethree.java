package com.max.idea;
import java.util.Scanner;

    public class Titlethree {
        public static void main(String[] args) {
            float metre;
            float mile;
            float yard;
            float foot;
            float kilo;
            float amerton;
            float pound;
            float ounce;
            Scanner scan = new Scanner(System.in);
            System.out.println("Выберите что переводить: \n расстояние - 1 \n масса - 2");
            int param = scan.nextInt();
            switch (param) {
                case 1:
                    System.out.println("Выберите единицу измерения: \n " +
                            "метр - 1 \n миля - 2 \n ярд - 3 \n фут - 4");
                    int unit = scan.nextInt();
                    System.out.println("Введите число");
                    float num = scan.nextFloat();
                    switch (unit) {
                        case 1:
                            metre = num;
                            mile = (float) (num * 0.000621371);
                            yard = (float) (num * 1.09361);
                            foot = (float) (num * 3.28084);
                            System.out.println("Метры:" + metre + "\n" + "Мили: " + mile + "\n"
                                    + "Ярды: " + yard + "\n" + "Футы: " + foot);
                            break;
                        case 2:
                            mile = num;
                            metre = (float) (num * 1609.34);
                            yard = (float) (num * 1760);
                            foot = (float) (num * 5280);
                            System.out.println("Метры:" + metre + "\n" + "Мили: " + mile + "\n"
                                    + "Ярды: " + yard + "\n" + "Футы: " + foot);
                            break;
                        case 3:
                            yard = num;
                            metre = (float) (num * 0.9144);
                            mile = (float) (num * 0.000568182);
                            foot = (float) (num * 3);
                            System.out.println("Метры:" + metre + "\n" + "Мили: " + mile + "\n"
                                    + "Ярды: " + yard + "\n" + "Футы: " + foot);
                            break;
                        case 4:
                            foot = num;
                            metre = (float) (num * 0.3048);
                            mile = (float) (num * 0.000189394);
                            yard = (float) (num * 0.333333);
                            System.out.println("Метры:" + metre + "\n" + "Мили: " + mile + "\n"
                                    + "Ярды: " + yard + "\n" + "Футы: " + foot);
                            break;
                        default:
                            System.out.println("Invalid value");
                    }
                    break;
                case 2:
                    System.out.println("Выберите единицу измерения: \n " +
                            "Килограмм - 1 \n Тонна США- 2 \n Фунт - 3 \n Унция - 4");
                    int unit2 = scan.nextInt();
                    System.out.println("Введите число");
                    float num2 = scan.nextFloat();
                    switch (unit2) {
                        case 1:
                            kilo = num2;
                            amerton = (float) (num2 * 0.00110231);
                            pound = (float) (num2 * 2.20462);
                            ounce = (float) (num2 * 35.274);
                            System.out.println("Килограмм " + kilo + "\n" + "Тонна США " + amerton + "\n"
                                    + "Фунт " + pound + "\n" + "Унция " + ounce);
                            break;
                        case 2:
                            amerton = num2;
                            kilo = (float) (num2 * 907.185);
                            pound = (float) (num2 * 2000);
                            ounce = (float) (num2 * 32000);
                            System.out.println("Килограмм " + kilo + "\n" + "Тонна США " + amerton + "\n"
                                    + "Фунт " + pound + "\n" + "Унция " + ounce);
                            break;
                        case 3:
                            pound = num2;
                            kilo = (float) (num2 * 0.453592);
                            amerton = (float) (num2 * 0.0005);
                            ounce = (float) (num2 * 16);
                            System.out.println("Килограмм " + kilo + "\n" + "Тонна США " + amerton + "\n"
                                    + "Фунт " + pound + "\n" + "Унция " + ounce);
                            break;
                        case 4:
                            ounce = num2;
                            kilo = (float) (num2 * 0.0283495);
                            amerton = (float) (num2 * 0.00003125);
                            pound = (float) (num2 * 0.0625);
                            System.out.println("Килограмм " + kilo + "\n" + "Тонна США " + amerton + "\n"
                                    + "Фунт " + pound + "\n" + "Унция " + ounce);
                            break;
                        default:
                            System.out.println("Invalid value");
                    }
                    break;
                default:
                    System.out.println("Invalid value");
            }
        }
    }