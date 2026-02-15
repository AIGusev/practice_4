package practice_4;

import java.util.Scanner;

public class DoWhileZ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count = 0;

        System.out.print("Напиши число: ");
        n = scanner.nextInt();

        do {
            n = n / 10;
            count++;
        } while (n > 0);
        System.out.println(count);
    }
}
