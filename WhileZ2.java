package practice_4;

import java.util.Scanner;

public class WhileZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Напиши число: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i++;
        }
    }
}
