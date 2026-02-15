package practice_4;

import java.util.Scanner;

public class BreakContinueZ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Отрицательные числа мы пропустим. Напиши число: ");
        int n = scanner.nextInt();
        System.out.println(n);
        do {
            System.out.print("Пишите числа: ");
            n = scanner.nextInt();

            if (n < 0) {
                continue;
            }
            if (n == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
