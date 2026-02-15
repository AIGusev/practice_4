package practice_4;

import java.util.Scanner;

public class BreakContinueZ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Напишите свои числа. Для выхода напишите отрицательное число: ");
            int n = scanner.nextInt();
            if (n < 0) {
                break;
            }
            sum = sum + n;
        }
        System.out.println("Общая сумма положительных чисел = " + sum);
    }
}
