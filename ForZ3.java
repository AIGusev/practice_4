package practice_4;

import java.util.Scanner;

public class ForZ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Напиши число: ");
        n = scanner.nextInt();

        for (int i = 1; i <= 10; i++ ) {
            System.out.println(i + " * " + n + " = " + (i * n));
        }
    }
}
