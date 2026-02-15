package practice_4;

import java.util.Scanner;

public class DoWhileZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "password";
        String n;

        do {
            System.out.print("Введите пароль: ");
            n = scanner.nextLine();

            if (!n.equals(password)) {
                System.out.println("Неверный пароль");
            }
        } while (!n.equals(password));
        System.out.println("Пароль верный!");
    }
}
