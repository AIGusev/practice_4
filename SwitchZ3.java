package practice_4;

import java.util.Scanner;

public class SwitchZ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько у тебя баллов? ");
        int b = scanner.nextInt();

        if (b < 0 || b > 100) {
            System.out.println("Неверное количество баллов");
        } else if (b < 60) {
            System.out.println("F");
        } else if (b < 70) {
            System.out.println("D");
        } else if (b < 80 ) {
            System.out.println("C");
        } else if (b < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");

        }
    }
}
