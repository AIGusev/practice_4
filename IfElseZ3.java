package practice_4;

import java.util.Scanner;

public class IfElseZ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Какая у тебя оценка? ");
        n = scanner.nextInt();

        if (n == 1 || n == 2) {
            System.out.println("Неудовлетворительно");
        } else if (n == 3) {
            System.out.println("Удовлетворительно");

        } else if (n == 4) {
            System.out.println("Хорошо");

        } else if (n == 5) {
            System.out.println("Отлично");

        } else {
            System.out.println("Такой оценки не существует");
        }

    }
}
