package practice_4;

import java.util.Scanner;

public class IfElseZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("Назови мне первое число: ");
        a = scanner.nextInt();
        System.out.print("Назови мне второе число: ");
        b = scanner.nextInt();

        if (a > b) {
            System.out.println("Наибольшее число " + a);
        } else if (b > a) {
            System.out.println("Наибольшее число " + b);
        } else {
            System.out.println("Числа равны");
        }

    }
}
