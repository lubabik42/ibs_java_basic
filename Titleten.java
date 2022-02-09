package com.company;

public class Titleten {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int[][] array = new int[sc.nextInt()][sc.nextInt()];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int[] i : array)
            for (int d : i) {
                System.out.print(d + " ");
                int lines;
                int columns;

                Scanner in = new Scanner(System.in);
                System.out.print("Количество строк: ");
                lines = in.nextInt();
                System.out.print("Количество столбцов: ");
                columns = in.nextInt();
                double[][] numbers = new double[lines][columns];

                for (int i = 0; i < lines; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.printf("Координаты элемента: [%d][%d]. Введите значение элемента:", i, j);
                        numbers[i][j] = in.nextDouble();
                    }
                    System.out.println();
                }
                int[] res = array[1];
                for (double d : res) {
                    System.out.println("Результат после умножения : " + (d * 3) + " ");
                    for (int i = 0; i < lines; i++) {
                        System.out.printf("Элемент [0][%d] * 3 = %.2f\n", i, numbers[0][i] * 3);
                    }
                }
            }
    }
}