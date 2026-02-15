package practice_4;

import java.util.Scanner;

public class ForZ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Напиши свое число: ");
        n = scanner.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } if (isPrime) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }
    }
}
