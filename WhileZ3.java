package practice_4;

import java.util.Scanner;

public class WhileZ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Напишите число: ");
        int n = scanner.nextInt();

        while (n >= 1) {
            System.out.println(n);
            n--;
        }

    }
}
