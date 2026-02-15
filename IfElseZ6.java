package practice_4;

import java.util.Scanner;

public class IfElseZ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Сколько у тебя баллов? ");
        n = scanner.nextInt();

        if (n < 0 || n > 100) {
            System.out.println("Неверное количество баллов");
        } else if (n < 60) {
            System.out.println("Неудовлетворительно");
        } else if (n < 75) {
            System.out.println("Удовлетворительно");
        } else if (n < 85) {
            System.out.println("Хорошо");
        } else {
            System.out.println("Отлично");
        }
    }
}
