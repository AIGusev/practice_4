package practice_4;

import java.util.Scanner;

public class IfElseZ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Назови свое число: ");
        n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
