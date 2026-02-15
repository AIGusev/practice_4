package practice_4;

import java.util.Scanner;

public class ForZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Напиши свое число: ");
        n = scanner.nextInt();
        int sum = 0;
        String numbers = "";

        for (int i = 1; i <= n; i++) {
            if (i < n) {
                numbers = numbers + i + " + ";
            } else {
                numbers = numbers + i;
            }
            sum = sum + i;
        }
        System.out.println(numbers + " = " + sum);
    }
}
