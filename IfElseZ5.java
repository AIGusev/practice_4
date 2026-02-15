package practice_4;

import java.util.Scanner;

public class IfElseZ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Сколько Вам лет? ");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Введите правильный возраст");
        } else if (n >= 65) {
            System.out.println("Ваша скидка составляет 30%");

        } else if (n < 18) {
            System.out.println("Ваша скидка составляет 25%");

        } else {
            System.out.println("Вам скидка не предоставлена");
        }

    }
}
