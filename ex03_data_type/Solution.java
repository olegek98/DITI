package ex03_data_type;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "DITI ";

        Scanner scan = new Scanner(System.in);

        /* Объявите для каждого типа: целочисленный, с плавающей точкой двойной точности, строка - вторую переменную. */

        //TODO: заполните значение каждой переменной тем, что введено в стандартный поток ввода
        //К примеру:
        //5
        //3.14
        //is the best place to learn and practice coding!

        //TODO: Напечатайте сумму целых значений

        //TODO: Напечатайте сумму дробных чисел

        //TODO: напечатайте результат конкатенации строк

        int b;
        double d = 4.0;
        String s = "DITI ";

        b = scan.nextInt();
        c = scan.nextDouble();
        scan.nextLine();
        f=scan.nextLine();

        int sum1= i+b;
        System.out.println(sum1);
        double sum2= c+d;
        System.out.println(sum2);
        String sum3 = s+f;
        System.out.println(sum3);
        scan.close();
    }
}
